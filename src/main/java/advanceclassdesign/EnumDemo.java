package advanceclassdesign;

public class EnumDemo {

    enum Week {

        M(1, "Monday"),
        T(2, "Tuesday"),
        F(5, "Friday");


        final private int day;
        final private String name;

        Week(int day, String name){
           this.day = day;
           this.name = name;
        }
    }

    public static void main(String[] args) {


    }
}
