import java.util.HashMap;
import java.util.Map;

public class Array {


  

    public static void main(String[] args) {

        //first example
        String[] table = new String[10];

        table[2] = "index 2";

        for (int i = 0 ; i < table.length; i++) {
            System.out.println(table[i]);
        }


        //second example
        int[] cupsOfCoffeePerDayOfTheWeek = new int[7];

        cupsOfCoffeePerDayOfTheWeek[4] = 3;
        // //Afficher le nombre de cafés le premier jour de la semaine
        // System.out.println(cupsOfCoffeePerDayOfTheWeek[0]);

        for(int i = 0; i < cupsOfCoffeePerDayOfTheWeek.length; i++) {
            System.out.println(cupsOfCoffeePerDayOfTheWeek[i]);
        }


        //dictionnairies
        Map<String, Integer> name = new HashMap<String, Integer>();

        name.put("john", 33);


        for(Map.Entry<String, Integer> entry: name.entrySet() ) {
            printEntry(entry);
        }

    

    }


    static void printEntry(Map.Entry entry) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    
      
        
    }




 
    
};


