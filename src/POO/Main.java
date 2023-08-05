package POO;

public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor(1,"Jose Julian","Developer");
        doctor.showInfo();

        //current month

        System.out.println("day of week -> "+Date.dayOfWeek());
        System.out.println("day of month -> "+Date.dayOfMonth());
        System.out.println("month -> "+Date.month());
    }
}
