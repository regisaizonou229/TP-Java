import java.util.Scanner;
public class nomÂge {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Entrez votre Prénom: ");
        String prenom= sc.nextLine();
        System.out.print("Entrez votre âge: ");
        int age= sc.nextInt();
        System.out.println("Bienvenue "+prenom+ ", vous avez "+age+ " ans!!");
        sc.close();
    }
    
}