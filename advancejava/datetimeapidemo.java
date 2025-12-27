package advancejava;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class datetimeapidemo {
    public static void main(String[] args) {
        System.out.println("This is code for Date and Time API demo.");
        LocalDate todaysDate = LocalDate.now();
        System.out.println("Today's date is: " + todaysDate);
        LocalDate yesterdaydate = todaysDate.minusDays(1);
        //in minus days we can eneter any specific day number to go back that many days
        System.out.println("Yesterday's date was: " + yesterdaydate);

        LocalDate tomorrowsdate = todaysDate.plusDays(1);
        //in plus days we can eneter any specific day number to go forward that many days
        System.out.println("Tomorrow's date will be: " + tomorrowsdate);
        LocalDate epochday = LocalDate.ofEpochDay(0);
        //
        System.out.println("Epoch day: " + epochday);
        // System.out.println("ZoneID: " + ZoneId.getAvailableZoneIds());
        System.out.println("America Zone date: " + LocalDate.now(ZoneId.of("America/New_York")));
        System.out.println("India Zone date: " + LocalDate.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("Current Zone ID: " + ZoneId.systemDefault());
        System.out.println("Zoned date Time: " + ZonedDateTime.now());



    }
}
