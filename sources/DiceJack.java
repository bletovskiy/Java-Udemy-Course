import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6: ");

        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int sum3 = scanner.nextInt();

        if(areLessThan1(sum1, sum2, sum3) || areHigherThan6(sum1, sum2, sum3)){
            System.out.println("You entered numbers outside the valid range");
            System.exit(0);
        }

        int sumOfNumbers = sum1 + sum2 + sum3;
        int sumOfDiceRolls = roll1 + roll2+ roll3;

        System.out.println("You Sum: " + sumOfNumbers + " Computer Sum: " + sumOfDiceRolls);

        if(userWon(sumOfNumbers,sumOfDiceRolls)){
            System.out.println("\nCongrats, you won");
        }else{
            System.out.println("\nBetter luck next time!");
        }

        scanner.close();
    }

    public static boolean areLessThan1(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean areHigherThan6(int num1, int num2, int num3){
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return(sumNumbers > sumDiceRolls && sumNumbers - sumDiceRolls < 5);
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6; // 0 - 5.999999
        randomNumber += 1; // 1 - 6.999999
        return (int)randomNumber; //1 - 6 
    }
}
