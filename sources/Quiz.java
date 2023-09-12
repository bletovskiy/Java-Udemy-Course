import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

    
        System.out.println("Question #1\n");
        System.out.println("Which country held the 2016 Summer Olympics?");
        System.out.println("\tA) China\n\tB) Ireland\n\tC) Brazil\n\tD) Italy\n");
        String firstAnswer = scan.nextLine();

        if(firstAnswer.equals("C")){
            score+=5;
            System.out.println("Correct\n");
        }else{
            System.out.println("Oh,no!");
        }


        System.out.println("Question #2\n");
        System.out.println("Which planet is the hottest?");
        System.out.println("\tA) Venus\n\tB) Saturn\n\tC) Mercury\n\tD) Mercury\n");
        String secondAnswer = scan.nextLine();

        if(secondAnswer.equals("A")){
            score+=5;
            System.out.println("Correct\n");
        }else{
            System.out.println("Oh,no!");
        }


        System.out.println("Question #3\n");
        System.out.println("What is the rarest blood type?");
        System.out.println("\tA) O\n\tB) A\n\tC) B\n\tD) AB-Negative\n");
        String thirthAnswer = scan.nextLine();

        if(thirthAnswer.equals("D")){
            score+=5;
            System.out.println("Correct\n");
        }else{
            System.out.println("Oh,no!");
        }

        
        System.out.println("Question #4\n");
        System.out.println("Which one of these characters is friends with Harry Potter?");
        System.out.println("\tA) Ron Weasley\n\tB) Hermione Granger\n\tC) Draco Malfoy\n");
        String fourthAnswer = scan.nextLine();

        if(fourthAnswer.equals("A")){
            score+=5;
            System.out.println("Correct\n");
        }else{
            System.out.println("Oh,no!");
        }


        System.out.println("Your final score is: "+score+"/20 points!");

        if(score >= 15){
            System.out.println("Wow, you know you stuff");
        }else{
            System.out.println("Try again!");
        }
    scan.close();
    }
}
