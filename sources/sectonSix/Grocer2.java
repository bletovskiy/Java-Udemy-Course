
import java.util.Scanner;

public class Grocer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String store[] = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");

        String response = scan.nextLine();

        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(response)){
                System.out.println("\nWe have that in aisles: " + i);
                break;
            }
        }
        scan.close();
    }
}
