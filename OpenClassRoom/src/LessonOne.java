// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

// package hello;
// /** Ceci est une implémentation du message traditionnel "Hello world!"
// * @author L'équipe Education d'OpenClassrooms
// */
// public class HelloWorld {
//     /** Le programme commence ici */
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }


public class LessonOne {
    
    public static void main(String[] args) {
        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;       
        
       
        //TODO Etape 1 : créez une variable daysInWeek avec une valeur de 7
         final int daysInWeek = 7;
   
      
      
    
        //TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci
       firstDay += 7;

        //TODO Etape 3 : créez une constante numérique nommé STARTINGDAY avec la nouvelle valeur de la variable firstDay    
        final int STARTINGDAY = firstDay;   
        
        // Affiche le résultat 
        System.out.println("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + STARTINGDAY);
    }  
    
}