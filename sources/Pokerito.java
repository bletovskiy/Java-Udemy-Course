import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        String yourCard = randomcard();
        String compCard = randomcard();

        System.out.println("Here's your card:");
        System.out.println(yourCard);


        System.out.println("Here's computer1 card:");
        System.out.println(compCard);

        int yourMatches = 0;
        int compMatches = 0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 1; i <= 5; i++){
            scan.nextLine();
            String draw = randomcard();
            System.out.println("Card " + i);
            System.out.println(draw);

            if(yourCard.equals(draw)){
            yourMatches++;
            }
            if(compCard.equals(draw)){
            compMatches++;
            }
        }

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + compMatches);

        if (yourMatches > compMatches){
            System.out.println("You Win!");
        }else if( compMatches > yourMatches){
            System.out.println("You lose!");
        }else{
            System.out.println("Tie");
        }

        scan.close();
    }
    public static String randomcard(){
        double randomNamber = Math.random() * 13;
        randomNamber +=1; // 1 - 13.99999
        int randomInt = (int)randomNamber; //1 -13

        switch (randomInt){
            case 1: return  "   _____\n"+
                            "  |A _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";

            case 2: return  "   _____\n"+
                            "  |2 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____Z|\n";

            case 3: return "   _____\n"+
                            "  |3 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____E|\n";

            case 4: return "   _____\n"+
                            "  |4 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____h|\n";

            case 5: return "   _____\n"+
                            "  |5 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____S|\n";

            case 6: return "   _____\n"+
                            "  |6 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____9|\n";

            case 7: return "   _____\n"+
                            "  |7 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____7|\n";

            case 8: return "   _____\n"+
                            "  |8 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____8|\n";

            case 9: return "   _____\n"+
                            "  |9 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____6|\n";

            case 10: return "   _____\n"+
                            "  |10 _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____10|\n";

            case 11: return "   _____\n"+
                            "  |J  WW|\n"+
                            "  | 0 ()|\n"+
                            "  |o o% |\n"+
                            "  | | % |\n"+
                            "  |__%%[|\n";

            case 12: return "   _____\n"+
                            "  |Q  WW|\n"+
                            "  | 0 ()|\n"+
                            "  |o o% |\n"+
                            "  | |%%%|\n"+
                            "  |_%%%Q|\n";

            case 13: return "   _____\n"+
                            "  |K  WW|\n"+
                            "  | 0 ()|\n"+
                            "  |o o% |\n"+
                            "  | |%%%|\n"+
                            "  |_%%%>|\n";
            default: return "this should never get called ";
        }
    }
}
