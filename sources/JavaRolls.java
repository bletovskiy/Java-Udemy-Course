import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");

        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        int score = 0;

        while (true){
            scan.nextLine();
            int diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);
            if (diceRoll == 6){
                System.out.println("End of game");
                break;
            }else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rollong.");
            }else{
                score++;
                System.out.println("One point. Keep rolling.");
            }
        }
        if (score >= 3){
            System.out.println("You win!");
        }else{
            System.out.println("You lose!");
        }

        scan.close();
    }
    public static int rollDice() {
        double randomnumber = Math.random() * 6; // 0 - 5.9999999999
        randomnumber++; // 1 + 6.99999
        return (int)randomnumber;
    }
}
