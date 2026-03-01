import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Year: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month (0-based): " + cal.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));

        int year = cal.get(GregorianCalendar.YEAR);
        System.out.println("Is leap year? " + cal.isLeapYear(year));
    }
}