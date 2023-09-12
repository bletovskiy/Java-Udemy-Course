import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("**********JavaPedia**********");
        System.out.println("How many historical figures will you register?");

        int people = scan.nextInt();

        String[][] database = new String[people][3];

        scan.nextLine();
        for (int i = 0; i < database.length; i++) {
            System.out.println("\nFigure: " + (i+1));
            System.out.print("\tName: ");
            database[i][0] = scan.nextLine();
            System.out.print("\tDate of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\tOccupation: ");
            database[i][2] = scan.nextLine();
            System.out.println("\n");
        }

        System.out.println("These are the values you stored:\n");
        print2DArray(database);
        System.out.println("\nWho do you want information on?");
        
        String name = scan.nextLine();
        System.out.println("\n");
        for (int i = 0; i < database.length; i++){
            if (database[i][0].equals(name)){
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }

        scan.close();
    }
    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }

}
