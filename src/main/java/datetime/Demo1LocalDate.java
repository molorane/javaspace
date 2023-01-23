package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Demo1LocalDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
        LocalDate localDate2 = LocalDate.now(ZoneId.of("Europe/Paris"));

        LocalDate localDate3 = LocalDate.of(2023, 2, 28);
        LocalDate localDate4 = LocalDate.of(2023, Month.FEBRUARY, 14);

        LocalDate localDate5 = LocalDate.parse("2023-04-23");

        LocalDate localDate6 = LocalDate.parse("2023-04-30", DateTimeFormatter.ISO_DATE);
        //LocalDate localDate7 = LocalDate.parse("2023-04-30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        LocalDate localDate8 = LocalDate.parse("Saturday,June 21,2022", DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println(localDate8);
    }

}
