package com.advanced.timefunctions;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.SortedMap;

public class PizzaOrderingTimeApp {
    public static void main(String[] args) {
        //Local Time
        LocalTime openingTime = LocalTime.of(11, 0);
        LocalTime closingTime = LocalTime.of(22, 0);
        System.out.println("Everyday we open the Pizza Shop at " +openingTime+ " and closes at " +closingTime);

        //Local Date
        LocalDate orderedDate = LocalDate.now().minusDays(3);
        System.out.println("The Pizza I ordered on : " +orderedDate);

        //Local Date Time
        LocalDateTime orderedDateTime = LocalDateTime.from(orderedDate.atStartOfDay()).withHour(17);
        System.out.println("I placed the ordered on: " +orderedDateTime);

        LocalTime deliveryTime = LocalTime.of(1, 10);
        System.out.println("The delivery Time is: " +deliveryTime);

        LocalDateTime estimatedDeliveryTime = orderedDateTime.plusHours(deliveryTime.getHour()).plusMinutes(deliveryTime.getMinute());
        System.out.println("The estimated Delivery Time is: " +estimatedDeliveryTime);

        LocalDateTime realDeliveryTime = orderedDateTime.plusMinutes(90);
        System.out.println("The Real Delivery Time is: " +realDeliveryTime);

        long differenceBetweenRealAndEstimated = ChronoUnit.MINUTES.between(estimatedDeliveryTime,realDeliveryTime);
        System.out.println("Difference is: " +differenceBetweenRealAndEstimated+ " in minutes");

        if(estimatedDeliveryTime.isBefore(realDeliveryTime)){
            System.out.println("The Pizza didn't arrive on time");
        }
        else
            System.out.println("The Pizza Arrived on time.");

        HijrahDate hijrahDate = HijrahDate.from(orderedDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Based on Hijrah calendar I ordered my pizza on: " + dateTimeFormatter.format(hijrahDate));

        ZonedDateTime myLocalDateTime = orderedDateTime.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("The time I ordered pizza was " + myLocalDateTime + " in Kolkata.");
        ZonedDateTime tokioDateTime = myLocalDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("The time I ordered pizza was " + tokioDateTime + " in NewYork.");

          //ZoneIds list
//        for (String zoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zoneId);
//        }

    }
}
