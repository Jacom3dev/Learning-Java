public class Loops {
    public static void main(String[] args) {

        //1 to 10
        for (int i = 1; i <=10 ; i++) {
            System.out.println("for ->"+i);
        }

        int i = 1;
        while (i<=10){
            System.out.println("while ->"+i);
            i++;
        }

        int a = 1;
        do {
            System.out.println("do while ->"+a);
            a++;
        }while (a<=10);


    }
}
