import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int secret = 4;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int number = scan.nextInt();



        while(number != secret){
             System.out.print("Guess again: ");
             number = scan.nextInt();
        }
        scan.close();
        
    }
}
