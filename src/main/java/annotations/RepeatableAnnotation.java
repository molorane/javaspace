package annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.temporal.WeekFields;
import java.util.Arrays;

import static annotations.DayOfMonth.*;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Schedules.class)
@interface Schedule {
    DayOfMonth dayOfMonth() default LAST;
    DayOfWeek[] dayOfWeek() default {DayOfWeek.SUNDAY};
    int[] hours() default {23, 0};
}

enum DayOfMonth {
    LAST,
    SECOND,
    FIRST,
    TENTH;
}

@Retention(RetentionPolicy.RUNTIME)
@interface Schedules {
    Schedule[] value();
    long d() default 0;
}

public class RepeatableAnnotation {

    @Schedule(dayOfMonth = TENTH, dayOfWeek = DayOfWeek.MONDAY, hours = {1, 2, 3, 4})
    @Schedule(dayOfMonth = LAST)
    public static void doPeriodicCleanUp(int x) {

    }

    public static void main(String[] args) {
        try {
            Class<?> c = RepeatableAnnotation.class;
            Method m = c.getMethod("doPeriodicCleanUp", int.class);

            Schedule[] ann = m.getAnnotation(Schedules.class).value();
            for (Schedule ma : ann) {
                System.out.printf("%s %s %s\n", ma.dayOfMonth(), Arrays.toString(ma.dayOfWeek()), Arrays.toString(ma.hours()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
