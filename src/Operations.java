public class Operations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x)); // ↑
        System.out.println(Math.floor(x)); //↓
        System.out.println(Math.pow(x,y)); //elevation param1 ^ param2
        System.out.println(Math.max(y,x*28));
        System.out.println(Math.min(x,x*20));
        System.out.println(Math.sqrt(y));//square root
        System.out.println(Math.PI);

        //area of a circle -> PI*r^2
        System.out.println(Math.PI * Math.pow(y,2)); // or Math.PI * (y*y)

        //area of a sphere -> 4*PI*r2
        System.out.println(4*Math.PI * Math.pow(y,2));

        //volume of a sphere-> (4/3)*PI*r3
        System.out.println((4/3)* Math.PI * Math.pow(y,3));

    }
}
