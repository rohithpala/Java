import java.util.Calendar;

public class DateDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print("Current time is " + cal.getTime());
        cal.add(Calendar.DATE, 10);
        System.out.print("\nAfter 10 Days: " + cal.getTime());
        cal.add(Calendar.MONTH, 1);
        System.out.print("\nAfter 1 Month: " + cal.getTime());
        cal.add(Calendar.YEAR, 2);
        System.out.print("\nAfter 2 Years: " + cal.getTime());
        System.out.println();
    }
}
