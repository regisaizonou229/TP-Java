import java.util.Scanner;
public class Factoriels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcule de factoriel");
        System.out.print("Entrez un entier naturel : ");
        int nombre = sc.nextInt();

        if (nombre < 0) {
            System.out.print("Erreur");
        } else {
            int fact = 1;
            for (int i = 1; i <= nombre; i++) {
                fact = fact * i;
            }
            System.out.print("Le factoriel de " + nombre + " est: " + fact);
        }

        sc.close();
    }
}
