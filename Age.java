import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entré votre âge : ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Mineur !!");
            System.out.println("________Assez refuse________");
        } else {
            System.out.println("Majeur ");
            System.out.println("________Assez Atoriser________");
        }
        sc.close();
    }
    
}