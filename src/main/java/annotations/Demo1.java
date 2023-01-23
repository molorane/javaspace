package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface JavaSpace {
    String str();
    int value();
}

@JavaSpace(value = 900, str = "Demo1")
public class Demo1 {

    @JavaSpace(str = "Java11", value = 30)
    public int name;

    @JavaSpace(str = "theSpace", value = 90)
    public static void theSpace() {

    }

    public static void main(String[] args) {

        try {
            Class<? extends Demo1> c = Demo1.class;

            Method m = c.getMethod("theSpace");

            Field f = c.getField("name");

            JavaSpace cx = c.getAnnotation(JavaSpace.class);

            JavaSpace mx = m.getAnnotation(JavaSpace.class);

            JavaSpace fx = f.getAnnotation(JavaSpace.class);

            System.out.printf("%s %s\n%s %s\n%s %s", cx.str(), cx.value(),  mx.str(), mx.value(),  fx.str(), fx.value());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
