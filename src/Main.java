import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime specificDay = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = specificDay.getYear();
        System.out.println("Year: " + year);

        Month month = specificDay.getMonth();
        System.out.println("Month: " + month);

        int dayOfTheMonth = specificDay.getDayOfMonth();
        System.out.println("Day of the month: " + dayOfTheMonth);

        DayOfWeek dayOfTheWeek = specificDay.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfTheWeek);
    }
}