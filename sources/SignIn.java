import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javagram! Sign in below");

        System.out.print("Username: ");
        String usernameEntry = scan.nextLine();
        System.out.print("Password: ");
        String passwordEntry = scan.nextLine();
        
        
        String username = "Samantha";
        String password = "Java<3";

        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)){
            System.out.println("\nIncorrect, please try again!");
            System.out.print("Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("Password: ");
            passwordEntry = scan.nextLine();
        }

        System.out.println("\nSUCCESS");

        scan.close();
    }
}
