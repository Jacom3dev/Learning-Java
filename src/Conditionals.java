public class Conditionals {
    public static void main(String[] args) {
        boolean bluetooth = true;
        boolean connection = false;

        for (int i = 0; i < 5; i++) {
            connection = Math.random() < 0.5;
            System.out.println("connecting...");
            if (connection) {
                System.out.println("connected");
                break;
            }
        }


        if (bluetooth && connection){
            System.out.println("Sending file...");
        }else {
            System.out.println("can not send the file");
        }


        //days

        int day = (int) Math.ceil(Math.random() * 7);
        //int day = (int) (Math.random() * 7) + 1;

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            default -> System.out.println("Saturday");
        }
    }
}
