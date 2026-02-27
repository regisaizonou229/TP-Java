import java.util.Scanner;
public class Moyenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moy;
        System.out.println("Veuillez entré les trois notes");
        System.out.print("Note 1: ");
        double a = sc.nextDouble();
        System.out.print("Note 2: ");
        double b = sc.nextDouble();
        System.out.print("Note 3: ");
        double c = sc.nextDouble();
        if (0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20) {
            moy = (a + b + c) / 3;
            if (moy < 10) {
                System.out.println("Ajourné !!");
            } else {
                System.out.println("Admis !!");
            }
        } else {
            System.out.print("Erreur");
        }
        sc.close();
    }
}