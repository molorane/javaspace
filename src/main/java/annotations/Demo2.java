package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MultiValue {
    int value() default 2;

    String message();

    double doubleValue();
}

public class Demo2 {

    @MultiValue(doubleValue = 900, message = "Hello")
    static String x;

    @MultiValue(doubleValue = 9, message = "Hello")
    public static void display() {

    }

    public static void main(String[] args) {

        try {

            Class<?> c = Demo2.class;

            Method m = c.getMethod("display");
            Field f = c.getField("x");

            MultiValue a = f.getAnnotation(MultiValue.class);

            System.out.println(a.doubleValue());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
