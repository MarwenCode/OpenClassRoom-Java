public class Variables {

    public static void main(String[] args) {
        String nom1 = "Jean";
     

        nom1 = "james";

        afficheNom(nom1);
        String nom2 = nom1;

        afficheNom(nom2);

        Personne person1 = new Personne("yoan");
        Personne person2 = person1;

        afficheNom(person1.name);
        afficheNom(person2.name);

        
    }

    static void afficheNom(String text) {
        System.out.println(text);
    }
    
}


class Personne {
    String name;


    Personne(String name) {
        this.name = name;
    }
}
