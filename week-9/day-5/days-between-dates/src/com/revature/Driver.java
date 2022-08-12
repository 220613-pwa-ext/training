package com.revature;

import java.time.LocalDate;

public class Driver {

    public static void main(String[] args) {
        String date1 = "2015-01-20";
        String date2 = "2022-08-12";

        LocalDate olderDate = LocalDate.parse(date1);
        long olderDateEpoch = olderDate.toEpochDay(); // number of days since Jan 01, 1970

        LocalDate newerDate = LocalDate.parse(date2);
        long newerDateEpoch = newerDate.toEpochDay();

        System.out.println(newerDateEpoch - olderDateEpoch);

        LocalDate ld = LocalDate.ofEpochDay(1); // 1970-01-02
        System.out.println(ld);
    }

}
