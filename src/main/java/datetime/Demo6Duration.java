package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Demo6Duration {

    public static void main(String[] args) {
        Duration d = Duration.of(90, ChronoUnit.HOURS);
        //System.out.println(d);

        Duration minutes = Duration.of(3600, ChronoUnit. MINUTES); // - PT60H
        Duration days = Duration.ofDays(4);  // - PT96H
        Duration hours = Duration.ofHours(4); // – PT4H
        Duration minutes1 = Duration.ofMinutes(5); // – PT5M
        Duration seconds = Duration.ofSeconds(3);// - PT30S
        //System.out.println(seconds);

        LocalTime comingMidnight = LocalTime.MIDNIGHT;
        LocalTime now = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().minusHours(4).minusMinutes(67);
        Duration between = Duration.between(localDateTime, localDateTime1);
        System.out.println(between);
    }

}
