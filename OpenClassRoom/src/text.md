Programmer en orienté objet avec Java
Vous n'avez pas validé ce quiz.

Vous n'avez pas atteint le seuil de validation de cet exercice, c'est-à-dire 70%. Ce n'est pas très grave car vous pourrez refaire le quiz dans 24h.

Compétences évaluées
Utiliser les principes de programmation orientée objet en Java
Question 1
Qu'est-ce qui est vrai concernant les objets et les classes ?

Attention, plusieurs réponses sont possibles.

Une classe est un type nommé qui est un peu comme le plan d'un objet.

Une classe est une instance d'un objet qui inclut des valeurs concrètes de ces attributs.

Une classe est considérée comme un type complexe car elle peut regrouper des attributs.
Pour créer une instance d'une classe, vous déclarez une variable. Une instance d'une classe est un objet.

Question 2
Voici le code d'une classe :

class Ticket {
    double price = 21.5;
    String destination = "New York";
    final int loyaltyPoints = 55;
}
Sélectionnez le code qui instancie un objet de cette classe ET utilise correctement les attributs de classe (champs).


Ticket ticket = new Ticket();
ticket.price = 15.5;
ticket.destination = "Toronto";
System.out.println(ticket.loyaltyPoints);

Ticket ticket;
new ticket=Ticket();
ticket.price = 15.5;
ticket.destination = "Toronto";
System.out.println(ticket::loyaltyPoints);

Ticket ticket = new Ticket();
ticket.price = 15.5;
ticket.destination = "Toronto";
ticket.loyaltyPoints = 150;
System.out.println(ticket.loyaltyPoints);

final Ticket ticket;
new ticket=Ticket();
ticket.price = 15.5;
ticket.destination = "Toronto";
System.out.println(ticket::loyaltyPoints);
Les réponses deux et quatre n'instancient pas un objet, vous pouvez donc les éliminer. La troisième réponse essaie d'assigner une nouvelle valeur à une constante. Elle est donc incorrecte.

Question 3
Le polymorphisme permet de réutiliser tout le code existant d’une classe mère.


Vrai

Faux
C’est l’héritage qui permet de réutiliser le code existant dans la classe mère.

Le polymorphisme fournit un mécanisme permettant de redéfinir une méthode existante dans la classe mère.

Question 4
Lesquelles des techniques suivantes sont utilisées pour contrôler le déroulement de votre programme ?

Attention, plusieurs réponses sont possibles.

Une déclaration IF/ELSE

Des variables  Boolean  et des types  enum

Des boucles

Des boucles infinies
Les booléens peuvent être utilisés pour évaluer les conditions, et les « enum » peuvent être utilisés pour fournir des conditions dans les instructions IF/ELSE, mais ils ne contrôlent pas directement le déroulement du programme. Les boucles infinies engendrent un dysfonctionnement de votre programme, elles ne le contrôlent pas.

Question 5
Étudiez l'extrait de code suivant :

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
Lequel des éléments suivants sera imprimé à la suite de cet extrait de code ?


k et t sont identiques

k et t sont différents, mais nous pouvons ajuster

k et t sont très différents

Rien ne s'affichera
Si vous faites le calcul pour toutes les conditions, seule la deuxième condition fonctionne :
K+3 == t - 2
11+3 == 16-2

Question 6
Qu'est-ce qui est vrai concernant les collections ?

Attention, plusieurs réponses sont possibles.

Les collections sont des variables du même type, regroupées.

Les types de collection les plus flexibles sont : listes ordonnées, listes non ordonnées et dictionnaires.

Les dictionnaires (maps) sont des listes ordonnées qui sont décrites par paires « clé-valeur ».

Les listes non ordonnées ne sont accessibles que par leurs touches.
Les dictionnaires ne sont pas des listes, ils ne sont donc ni ordonnés, ni non ordonnés. Seuls les dictionnaires ont des paires clé/valeur.

Question 7
Parmi les affirmations suivantes, laquelle ou lesquelles concernent les paramètres et les valeurs de retour d'une fonction ?

Attention, plusieurs réponses sont possibles.

Les paramètres d'une fonction sont des variables définies dans une signature de méthode comme étant des entrées nécessaires à l'exécution d'une tâche.

Les arguments sont des valeurs envoyées à une méthode.

Les valeurs renvoyées sont la sortie ou, en d'autres termes, le résultat qu'une fonction doit retourner.

Les paramètres et les valeurs renvoyées sont obligatoires dans les fonctions.
Les paramètres et les valeurs renvoyées sont utiles mais non obligatoires.

Question 8
Jetez un coup d'œil à l'extrait de code suivant :

public static int transform(int a, int b) {
    int x = a + b;
    int y = x * 2;
    return y;
}

public static void main(String[] args) {
    int x = 1;
    int y = 10;
    x = transform(x, y);
    y = transform(y, x);
}
Quelles seront les valeurs des variables  x  et  y  à la fin de l'exécution ?


x -> 1, y -> 10

x -> 22, y -> 64

x -> 64, y -> 22

x -> 1, y -> 64
Nous appelons la fonction  transform()  en lui passant des paramètres par valeur. La valeur retournée par le premier appel (22) est affectée localement à la variable  x  (qui passe donc  de 1 à 22). Lors du deuxième appel, cette nouvelle valeur de la variable  x  est passée en paramètre d’appel en même temps que la valeur initiale de  y.