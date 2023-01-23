package datetime;

import java.time.*;

public class Demo5Period {

    public static void main(String[] args) {

        Period weeks = Period.ofWeeks(5); //  P14D
        Period months = Period.ofMonths(2); // – P2M
        Period years = Period.ofYears(2); // – P2Y
        Period parse = Period.parse("P1Y2M8D"); // - P1Y2M8D
        Period period = Period.ofDays(100);
        //System.out.println(parse);


        LocalDate dob = LocalDate.of(1991, Month.MAY, 20);
        LocalDate now = LocalDate.now();
        //System.out.println(Period.between(now, dob).getMonths());

        System.out.println(period.toString());
    }

}
