import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сумму счёта:");
        double bill = scan.nextDouble();
        System.out.println("Введите процент чаевых:");
        int tip = scan.nextInt();

        tipTheWaiter(bill,tip);
        scan.close();
    }
    public static void tipTheWaiter(double bill,int tip){
        System.out.println(bill/100*tip);
    }
}
