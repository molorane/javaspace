package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Demo3LocalDateTime {

    public static void main(String[] args) {
        p();
    }

    public static void p() {
        LocalDateTime comingMidnight =
                LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(now, comingMidnight);
        System.out.println(between);
    }

}
