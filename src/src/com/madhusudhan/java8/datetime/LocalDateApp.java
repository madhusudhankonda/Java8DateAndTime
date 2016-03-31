package com.madhusudhan.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by mkonda on 29/03/2016.
 */
public class LocalDateApp {

    public void testLocalDateTime(){
        LocalDate date  = LocalDate.of(2016, Month.APRIL, 23);
        System.out.println(date);
        LocalTime time = LocalTime.of(23, 25);
        System.out.println(time);
    }
    public static void main(String[] args) {
    new LocalDateApp().testLocalDateTime();
    }

}
