package com.java8;





import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static ThreadLocal<DateFormat> sdfThreadLocal = new ThreadLocal<DateFormat>() {

        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd");
        }
    };

    public static String formatDate(Date date) throws ParseException {
        return sdfThreadLocal.get().format(date);
    }

    public static Date parse(String strDate) throws ParseException {

        return sdfThreadLocal.get().parse(strDate);
    }
}
