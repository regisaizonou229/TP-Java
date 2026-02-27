import java.util.Scanner;
public class TableMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        System.out.println("\n__Table de " + n + " __");
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + (n * j));
        }
        sc.close();
    }
}