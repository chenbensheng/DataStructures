package com.java8;

import lombok.var;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class TestTimeAdjuster {


    @Test
    public void test1() {
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("现在是：" + ldt1);

        LocalDateTime ldt2 = ldt1.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("下一个周日是：" + ldt2);
    }

    @Test
    public  void test2(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ISO_DATE.format(ldt));
    }
}
