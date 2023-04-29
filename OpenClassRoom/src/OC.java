public class OC {

    public static void main(String[] args) {

        // Exemple.prinText();
        // Bonjour("Mike");

        // for (int i = 0; i < 10; i++) {
        //     Bonjour("Mike");
        // }

        int[] myArray = new int[]{7,2,4};
        for (int i=0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        int n = 10;
        int numTrees = numberOftrees(n);
        System.out.println("Total Number of trees printed: " + numTrees);


        int i = 5;
        boolean sunIsUp = theSunisUp(i);
        System.out.println(sunIsUp);

        // int i = 0;
        // while (i < 20 ) {
        //     i = randomNumber();
        //     print(i);
        // }
    }

    // static void Bonjour(String name) {
    //     System.out.println("Hello " + name + " ! . How are you ?");
    // }

    static void print(int nombre) {
        System.out.println("Number: " + Integer.toString(nombre));
    }

    static int randomNumber() {
        return (int) (Math.random() * (2 - 0) + 1);
    }

    static int numberOftrees(int n) {
        int numbersOfTrees = 0;
        while (numbersOfTrees < n) {
            numbersOfTrees++;
            System.out.println(" number of Tree " + numbersOfTrees);
        }
        return numbersOfTrees;
    }


    static  boolean theSunisUp(int n ) {
        while (n >= 0) {
            System.out.println("the sun is up so wake up");
            return true;
        } 

        System.out.println("still night");
        return false;
    


    }
   




}

class Exemple {

    static String text = "Hello, it's me!";

    static void prinText() {
        System.out.println(text);
    }
}
