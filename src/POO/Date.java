package POO;

import java.util.Calendar;

public class Date {
    private static final Calendar CALENDAR = Calendar.getInstance();
    private static final String[] DAYS_OF_WEEK = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };

    private static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };


    public static String dayOfWeek(){
        int dayOfWeek = CALENDAR.get(Calendar.DAY_OF_WEEK);
        return  DAYS_OF_WEEK[dayOfWeek-1];
    }

    public static int dayOfMonth(){
        return CALENDAR.get(Calendar.DAY_OF_MONTH);
    }
    public static String month(){

        int month = CALENDAR.get(Calendar.MONTH);

        return MONTHS[month];
    }

}
