package com.techouts.cj8.DateAndTimeApi;

import java.time.*;

public class Basic2 {
    public static void main(String[] args) {
        //Java 8 splits date and time functionality into different classes


        //1 Local API (no timezone) :
        LocalDate date = LocalDate.now();         // now date
        LocalTime time = LocalTime.now();         // now time
        LocalDateTime dateTime = LocalDateTime.now(); // current date and time

        //2️⃣ Zoned API (with timezone)
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        //3️⃣ Period and Duration


    }
}
