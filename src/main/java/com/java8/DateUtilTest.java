package com.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtilTest {

    public static class SimpleDateFormatThread extends Thread {

        private String dateStr;

        public SimpleDateFormatThread(String dateStr){
            this.dateStr = dateStr;
        }

        @Override
        public void run() {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                System.out.println(this.getName()+":"+sdf.parse(dateStr));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        String dateStr = "2018-11-03 10:02:47";
        for (int i = 0; i <5 ; i++) {
            new SimpleDateFormatThread(dateStr).start();
        }
    }


}
