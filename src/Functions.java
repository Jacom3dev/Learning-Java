public class Functions {
    public static void main(String[] args) {
        int diceOne = randomNumber();
        int diceTwo = randomNumber();

        String diceOneVisual = dice(diceOne);
        String diceTwoVisual = dice(diceTwo);


        String[] linesOne = diceOneVisual.split("\n");
        String[] linesTwo = diceTwoVisual.split("\n");

        System.out.println("diceOne: "+diceOne+ " diceTwo: "+diceTwo);
        for (int i = 0; i < linesOne.length; i++) {
            System.out.println(linesOne[i] + "   " + linesTwo[i]);
        }
    }

    public  static int randomNumber (){
        return  (int) Math.ceil(Math.random() * 6);
    }

    public static String  dice(int number){
        String[] diceRepresentation = {
                "-------\n|     |\n|  *  |\n|     |\n-------",
                "-------\n| *   |\n|     |\n|   * |\n-------",
                "-------\n| *   |\n|  *  |\n|   * |\n-------",
                "-------\n| * * |\n|     |\n| * * |\n-------",
                "-------\n| * * |\n|  *  |\n| * * |\n-------",
                "-------\n| * * |\n| * * |\n| * * |\n-------"
        };

        return  diceRepresentation[number-1];
    }

}
