import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2010);
        calendar.set(Calendar.MONTH,Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        calendar.set(Calendar.HOUR_OF_DAY,12);

        calendar.add(Calendar.YEAR,-10); // Mengurangi tahun

        Date result = calendar.getTime();
        System.out.println(result);
    }
}