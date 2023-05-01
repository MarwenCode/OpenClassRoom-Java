import javafx.scene.control.TextField;

public class OC {

    // enum Direction {
    //     north, east, south, west;
    // }

    public static void main(String[] args) {

        // Exemple.prinText();
        // Bonjour("Mike");

        // for (int i = 0; i < 10; i++) {
        // Bonjour("Mike");
        // }

        // int[] myArray = new int[]{7,2,4};
        // for (int i=0; i<myArray.length; i++) {
        // System.out.println(myArray[i]);
        // }

        // int n = 10;
        // int numTrees = numberOftrees(n);
        // System.out.println("Total Number of trees printed: " + numTrees);

        // int i = 5;
        // boolean sunIsUp = theSunisUp(i);
        // System.out.println(sunIsUp);

        // int i = 0;
        // while (i < 20 ) {
        // i = randomNumber();
        // print(i);
        // }

        // handle the conditions :
        // int number = 1;
        // if (number == 1) {
        //     console("if 1");

        // } else if (number == 2) {
        //     console("if 2 is true");

        // } else {
        //     console("different number");
        // }

        // switch (number) {
        //     case 1:
        //         console("switch 1");
        //         break;

        //     default:
        //         console("default");

        // };

        // second example to handle the conditions
        String[] arg = {"this is the text "};

        if (arg.length == 1) {
            console2(arg[0]);
        } else if (arg.length == 2) {
            console2(arg[0] + "-" + arg[1]);
        } else if (arg.length == 3) {
            console2(arg[0] + "-" + arg[1] + "-" + arg[2]);
        } else {
            console2("this text contain more than 3 letters");
        }



       // switch directions
       String direction = "north";
     switch(direction) {
        case "north":
        System.out.println("You are heading north");
        break;
    case "east":
        System.out.println("You are heading east");
        break;
    case "south":
        System.out.println("You are heading south");
        break;
    case "west":
        System.out.println("You are heading west");
        break;
        

     }




    }


    //directions to switch cases :
    static void Direction(String text) {
       
        System.out.println(text);
    }


































    // static void Bonjour(String name) {
    // System.out.println("Hello " + name + " ! . How are you ?");
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

    static boolean theSunisUp(int n) {
        while (n >= 0) {
            System.out.println("the sun is up so wake up");

        }

        System.out.println("still night");
        return false;

    }

    // handle the conditions and else if else, switch :
    static void console(String text) {
        System.out.println(text);
    }

   // handle 3 conditions
   static void console2(String text) {
    System.out.print(text);
}

}

// class Exemple {

// static String text = "Hello, it's me!";

// static void prinText() {
// System.out.println(text);
// }
// }
