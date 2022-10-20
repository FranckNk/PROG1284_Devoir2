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
    static int Max           = 100;
    static int Min           =  0;
    static int TailleTableau = 15;

    private static void AfficheTableau(Integer [] Tableau){
        for (int i = 0; i < Tableau.length; i++) {
            System.out.format("Tableau[%2d] = %2d\n", i, Tableau[i]);
        }
    }

    private static void RemplirRandTableau(Integer [] Tableau){
        Random rand = new Random();
        int NombreAleatoire = 0;
        for (int i = 0; i < Tableau.length; i++) {
            Tableau[i] = rand.nextInt(Max - Min + 1) + Min;
        }
    }

    public static void main(String[] args) throws Exception {
        Integer Table [] = new Integer[TailleTableau];
        RemplirRandTableau(Table);
        AfficheTableau(Table);
        
    }
}
