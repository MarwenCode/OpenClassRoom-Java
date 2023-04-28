public class ClassString {

    public static void main(String[] args) {
        String firstWord = "Hello";

        String toUperCaseWord = firstWord.toUpperCase();
        String firstReplaceWord = toUperCaseWord.replace("LO", "YOO");

        System.out.println(firstReplaceWord);
    }
    
}
