import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");

        String responce = scan.nextLine();

        if (responce.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!\n");

            String userChoice = scan.nextLine();
            String compChoice = computerChoice();



            String finalResult = result(userChoice, compChoice);
            printResult(userChoice, compChoice, finalResult);

        }else{
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }

    public static String computerChoice(){
        int randomNumber = (int)(Math.random() * 2); // 0 - 2
        if (randomNumber == 0){
            return "rock";
        }else if(randomNumber == 1){
            return "paper";
        }else if(randomNumber == 2){
            return "scissors";
        }else{
            return "Error in the app. Please visit this bug!";
        }
    }

    public static String result(String userChoice, String compChoice){
        String result = "";

        if(userChoice.equals("rock") && compChoice.equals("scissors")){
            return "You win";
        }else if(userChoice.equals("paper") && compChoice.equals("rock")){
            return "You win";
        }else if(userChoice.equals("scissors") && compChoice.equals("paper")){
            return "You win";
        }else if(compChoice.equals("rock") && userChoice.equals("scissors")){
            return "You lose";
        }else if(compChoice.equals("paper") && userChoice.equals("rock")){
            return "You lose";
        }else if(compChoice.equals("scissors") && userChoice.equals("paper")){
            return "You lose";
        }else if (userChoice.equals(compChoice)){
            return "Its a tie!";
        }else{
            System.out.println("Invalid choice");
            System.exit(0);
        }
        return result;
    }

    public static void printResult(String userChoice, String compChoice, String result){
        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + compChoice);
        System.out.println(result);
    }

}
