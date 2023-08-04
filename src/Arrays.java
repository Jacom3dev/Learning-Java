public class Arrays {
    public static void main(String[] args) {
        String[] numberToString = new String[10];
        int [][] randomNumbers = new int[5][5];

        for (int i = 0; i <10 ; i++) {
            numberToString[i] = String.valueOf(i+1);
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                randomNumbers[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        //for-each
        for (String number:numberToString) {
            System.out.println("string -> "+number);
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                System.out.print(randomNumbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
