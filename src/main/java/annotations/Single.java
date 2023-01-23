package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int valuer() default 9;
}

public class Single {

    @MySingle
    public static void myMeth() {
        try {
            Class<?> c = new Single().getClass();

            Method m = c.getMethod("myMeth");

            MySingle ann = m.getAnnotation(MySingle.class);

            System.out.println(ann.valuer());
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        myMeth();
    }

}
