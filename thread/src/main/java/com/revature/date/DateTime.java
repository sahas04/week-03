package com.revature.date;

import java.util.Date;
import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {
        Date today=new Date();
        System.out.println(today);

        LocalDate today1=LocalDate.now();
        System.out.println(today1);


    }
}
