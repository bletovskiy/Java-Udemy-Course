public class BreakAndContinueExamples {

    public static void main(String[] args) {
        
        for (int i = 1; i < 11; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

        
        System.out.println("the smallest number");
        for (int i = 21; i < 30; i++){
            if(i % 3 == 0){
                System.out.println("the smallest number greater than 20 that is divisible by 3: " + i);
                break;
            }

        }

        

        System.out.println("\nEven numbers");
        for (int i = 1; i < 21; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nEven numbers");
        for (int i=9; i > 0; i--) {
            if (i%2 == 0) {
                continue;
            } else if (i == 3) {
                break;
            }
            System.out.println(i);
         }
    }
}
