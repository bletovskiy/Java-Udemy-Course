
public class workbook32 {
    public static void main(String[] args) {
        double wallet = 49.99;
        System.out.println("Can you buy me this?");
        if(wallet >= 50){
            System.out.println("sure");
            wallet-=50;
        }else{
            System.out.println("sorry, I have only "+ wallet+ "$" +" left");
        }
    }
}
