import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarProgram {
    public static void main(String[] args) {

        // Using Calendar
        Calendar cal = Calendar.getInstance();

        System.out.println("Using Calendar:");
        System.out.println("Date: " + cal.get(Calendar.DATE));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Time: " + cal.get(Calendar.HOUR)
                + ":" + cal.get(Calendar.MINUTE)
                + ":" + cal.get(Calendar.SECOND));

        // Using GregorianCalendar
        GregorianCalendar gcal = new GregorianCalendar();

        System.out.println("\nUsing GregorianCalendar:");
        System.out.println("Date: " + gcal.get(Calendar.DATE));
        System.out.println("Month: " + (gcal.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + gcal.get(Calendar.YEAR));
        System.out.println("Time: " + gcal.get(Calendar.HOUR)
                + ":" + gcal.get(Calendar.MINUTE)
                + ":" + gcal.get(Calendar.SECOND));
    }
}