public class Casting {
    public static void main(String[] args) {
        //en un año encontre 30 perritos ¿cuántos encontre en un mes ?
        float year = 12F;//12 month
        float month = 30F;//30 days
        float monthlyDog = month/year;

        System.out.println((int) monthlyDog);//delete decimals

        //accuracy
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);


        double c = (double) a/b;
        System.out.println(c);
    }
}
