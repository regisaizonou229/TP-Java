import java.util.Scanner;
public class MiniCalculatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre  : ");
        double a = sc.nextDouble();

        System.out.print("Entrez l'opérateur (+ - * /) : ");
        char op = sc.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        double b = sc.nextDouble();

        double resultat;

        switch (op) {
            case '+':
                resultat = a + b;
                System.out.println(a + " + " + b + " = " + resultat);
                break;
            case '-':
                resultat = a - b;
                System.out.println(a + " - " + b + " = " + resultat);
                break;
            case '*':
                resultat = a * b;
                System.out.println(a + " * " + b + " = " + resultat);
                break;
            case '/':
                if (b != 0) {
                    resultat = a / b;
                    System.out.println(a + " / " + b + " = " + resultat);
                } else {
                    System.out.println("Erreur : Division par zéro !");
                }
                break;
            default:
                System.out.println("Opérateur invalide !");
        }

        sc.close();
    }
}