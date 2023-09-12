import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nWelcome to java Casino!");
        System.out.println("Do you have a knack for Black jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        
        System.out.println("\n You get a \n" + cardString(card1) + "\n and a \n" + cardString(card2));
        int total = Math.min(card1,10) + Math.min(card2,10);
        System.out.println("Your total is: " + total);

        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        
        System.out.println("\n The deaker shows \n" + cardString(dealerCard1) + " \nand has a card facing down" + faceDown());

        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2,10);
        System.out.println("\nThe dealer's total is hidden");

        while (true) {
            String option = hitOrStay();

            if (option.equals("stay")){
                break;
            }
            int newCard = drawRandomCard();
            total += Math.min(newCard, 10);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("Youe total is " + total);

            if (total > 21){
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        }
        System.out.println("\nDealer's turn");
        System.out.println("\n The deale's card are \n" + cardString(dealerCard1) + "\n and a \n" + cardString(dealerCard2));


        while (dealerTotal < 17){
            int newCard = drawRandomCard();

            dealerTotal += Math.min(newCard, 10);
            System.out.println("\n Dealer gets a \n" + cardString(newCard));
            System.out.println("Dealer's total is " + dealerTotal);
        }

         if(dealerTotal > 21){
            System.out.println("Bust! Dealer loses.");
            System.exit(0);
         }

         if (total > dealerTotal){
            System.out.println("Player wins!");
         }else{
            System.out.println("Dealer wins!");
         }

         if (total == 21){
            System.out.println("Lucky!");
         }else if(dealerTotal == 21){
            System.out.println("Lucky!");
         }else if (total == dealerTotal){
            System.out.println("Tie");
         }

    scan.close();
    }
    public static int drawRandomCard(){
        double randomNumber = Math.random() * 13;
        randomNumber +=1; // 1 - 13.99999
        return (int)randomNumber;
    }

    public static String cardString(int cardNumber){
        switch(cardNumber){
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

            default: return "Not possible";
        }
        
    }
    public static String faceDown(){
        return
        "\n  _____\n"+
        " |     |\n"+
        " |  J  |\n"+
        " | JJJ |\n"+
        " |  J  |\n"+
        " |_____|\n";
    }
    public static String hitOrStay(){
        System.out.println("would you like hit or stay?");
        String response = scan.nextLine();

        while (!(response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay"))){
            System.out.println("Please write hit or stay");
            response = scan.nextLine();
        }
        return response;
    }
}
