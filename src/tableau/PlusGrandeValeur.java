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
    static int Max = 100;
    static int Min = 0;

    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int NombreAleatoire = rand.nextInt(Max - Min + 1) + Min;
        System.out.println("Rand : " + NombreAleatoire);
    }
}
