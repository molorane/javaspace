package datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Demo2LocalTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime timea = LocalTime.from(localDateTime);
        LocalTime time = LocalTime.now();
        LocalTime localTime1 = LocalTime.now(ZoneId.systemDefault());
        LocalTime localTime2 = LocalTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        LocalTime localTime3 = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime localTime4 = LocalTime.now(ZoneId.of("Africa/Johannesburg"));
        LocalTime time3 = LocalTime.of(2,4);
        LocalTime time4 = LocalTime.of(2,4, 3);
        LocalTime time5 = LocalTime.of(2,4, 3, 9);
        LocalTime time2 = LocalTime.parse("12:10:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        //System.out.println(time2);


        LocalTime localTime = LocalTime.now();
        System.out.println("Current time is: " + localTime);

        LocalTime currTime = localTime;
        System.out.println("Current time is: " + currTime);
        System.out.println("My meeting is at: " + currTime.plusMinutes(4).plusHours(5));
        System.out.println("Of seconds: " + LocalTime.ofSecondOfDay(1200));
    }

}
