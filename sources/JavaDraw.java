import java.util.Scanner;

public class JavaDraw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.print("\nWhich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant  ");
        System.out.println("Write 3 for bear      ");
        System.out.println("Write 4 for snake     ");

        choice = scan.nextInt();
        draw(choice);
        scan.close();

        
    }
    public static void draw(int choice){
        switch (choice) {
            case 1: System.out.println("Butterfly");break;
            case 2: System.out.println("Elephant");break;
            case 3: System.out.println("Bear");break;
            case 4: System.out.println("Snake"); break;
            default:break;
        }
    }
    
}
