/*

TITRE          : Maximum du tableau
AUTEUR         : Franck Nkeubou Awougang
DATE           : 20/10/2022
DESCRIPTION    : Programme qui génère les valeurs aléatoire d'un tableau de taille 10 puis, détermine son maximum.
VERSION        : 0.0.1

*/

package tableau;
import java.util.Random;
import java.util.Scanner;

public class PlusGrandeValeur {
    // Déclarons les variables.
    static int Max           = 100;
    static int Min           =  0;
    static int TailleTableau = 15;

    // Affichons le tableau.
    private static void AfficheTableau(Integer [] Tableau){
        System.out.println("****************Affichage du tableau**************");
        for (int i = 0; i < Tableau.length; i++) {
            System.out.format("Tableau[%2d] = %2d\n", i, Tableau[i]);
        }
    }
    // Remplissons le tableau de manière aléatoire.
    private static void RemplirRandTableau(Integer [] Tableau){
        Random rand = new Random();
        for (int i = 0; i < Tableau.length; i++) {
            Tableau[i] = rand.nextInt(Max - Min + 1) + Min;
        } 
    }
    // Cherchons l'index du plus grand élément du tableau.
    private static int FindMaxIndex(Integer [] Tableau){
        // Supposons que le premier élément est le plus grand.
        int MaxValue = 0;
        for (int i = 0; i < Tableau.length; i++) {
            if(Tableau[MaxValue] < Tableau[i])
                MaxValue = i;
        }
        return MaxValue;
    }
    // fonction pour faire une pause sur l'écran.
    static void Pause(){
        System.out.print("\nPress any key to continue...");
        Scanner pause = new Scanner(System.in);
        pause.nextLine();
    }

    public static void main(String[] args) throws Exception {
        int IndexMax     = 0;
        Integer Table []     = new Integer[TailleTableau];
        RemplirRandTableau(Table);
        AfficheTableau(Table);
        // Récupérons les informations du max du tableau.
        IndexMax = FindMaxIndex(Table);
        // Maintenant affichons les dernières informations.
        System.out.println("Le plus grand nombre du tableau est : " + Table[IndexMax]);
        System.out.println("Il est à l'index : " + IndexMax);
        Pause();
    }
}
