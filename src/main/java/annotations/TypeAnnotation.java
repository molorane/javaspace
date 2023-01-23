package annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@interface TypeAnnotationDemo{}

@TypeAnnotationDemo
public class TypeAnnotation {


    public static @TypeAnnotationDemo int test() {
        return 0;
    }

    public static void main(@TypeAnnotationDemo String[] args) {

        @TypeAnnotationDemo
        String name = "JavaSpace";

        System.out.println(name);
    }

}
