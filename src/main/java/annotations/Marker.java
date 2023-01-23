package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@interface Update {

}


@Retention(RetentionPolicy.RUNTIME)
@interface Select {

}


public class Marker {


    @Select
    public static void select() {

    }

    @Update
    public static void changeName() {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Marker mk = new Marker();

        Method md = mk.getClass().getMethod("select");

        if (md.isAnnotationPresent(Update.class)) {
            System.out.println("Annotation Present");
        } else {
            System.out.println("Annotation not present");
        }
    }

}
