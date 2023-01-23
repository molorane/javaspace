package datetime;

import java.time.*;
import java.util.Set;

public class Demo7Zones {

    public static void main(String[] args) {
        p1();
    }

    public static void p() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        System.out.println("Number of available time zones is: " + zones.size());
        zones.forEach(System.out::println);
    }

    public static void p3() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        ZoneId myZone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println(zonedDateTime);

        LocalDateTime dateTime = LocalDateTime.now();
        zonedDateTime = dateTime.atZone(myZone);

        System.out.println(zonedDateTime);
    }

    public static void p1() {
        ZoneId myZone = ZoneId.of("America/Argentina/Buenos_Aires");
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = dateTime.atZone(myZone);
        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println(zoneOffset);
    }

}
