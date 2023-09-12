import java.util.Scanner;

public class DetentionWB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        for(int i = 0; i < 10; i++){
            System.out.println(word);
        }
        scan.close();
    }
}
