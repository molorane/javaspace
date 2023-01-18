package streamapi.find;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class FindFirstUse1 {

    OptionalDouble od;

    public static void main(String[] args) {
        Method[] methods = Stream.class.getMethods();
        Optional<String> methodName = Arrays.stream(methods)
                .map(method -> method.getName())
                .filter(name -> name.endsWith("Match"))
                .sorted()
                .findAny();
        System.out.println("Result: " + methodName.orElse("No suitable method found"));
    }

}
