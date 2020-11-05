package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;



public class Test{
    private static String app_key = "key";
    private static  String app_secret = "secret";
    private static final char HEX_DIGITS[] =
            { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
                    'e', 'f' };

    public static void main(String args[]){
        String json="{\"subject\": \"math\",\"taskName\": \"客户端java\",\"type\": \"imageStructProcessor\",\"urls\": [\"http://img.static.hexinedu.com/open/demo/math.jpg\", \"http://img.static.hexinedu.com/open/demo/math.jpg\"]}";
        doPost("http://open.hexinedu.com/api/open/task/create", json);
    }
    public static String doPost(String httpUrl, String param) {

        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        String result = null;
        try {
            URL url = new URL(httpUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(60000);
            long curentMills = System.currentTimeMillis();
            String nonstr = UUID.randomUUID().toString();
            String signture = app_key + ":" + nonstr + ":" + app_secret + ":" + curentMills;
            signture = encode(signture);
            System.out.println(String.valueOf(curentMills));
            System.out.println(nonstr);
            System.out.println(signture);
//           String app_signture=EncryptUtils.encryptSHA1ToString(signture);
            connection.setRequestProperty("app-timestamp", String.valueOf(curentMills));
            connection.setRequestProperty("app-key", app_key);
            connection.setRequestProperty("app-signature", signture);
            connection.setRequestProperty("app-nonstr", nonstr);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestProperty("Content-Type", "application/json");
            os = connection.getOutputStream();
            os.write(param.getBytes());
            if (connection.getResponseCode() == 200) {

                is = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

                StringBuffer sbf = new StringBuffer();
                String temp = null;
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
                System.out.println(result);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            connection.disconnect();
        }
        return result;
    }

    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        // 把密文转换成十六进制的字符串形式
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }

    public static String encode(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(str.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
