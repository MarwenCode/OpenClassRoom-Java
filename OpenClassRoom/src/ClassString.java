public class ClassString {

    public static void main(String[] args) {
        String firstWord = "Hello";

        String toUperCaseWord = firstWord.toUpperCase();
        String firstReplaceWord = toUperCaseWord.replace("LO", "YOO");

        System.out.println(firstReplaceWord);


        int k = 11;
        int t = 16;
        if (k == t) {
            System.out.println("k et t sont identiques");
        }
        else if (k + 3 == t - 2) {
            System.out.println("k et t sont différents mais nous pouvons ajuster");
        }
        else {
            System.out.println("k et t sont très différents");
        }
    }
    
}
