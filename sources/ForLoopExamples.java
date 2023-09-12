public class ForLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10


        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
        System.out.println("");

        // Example 2: Print "Hello, world!" 5 times


        for(int i = 0; i < 5; i++){
            System.out.println("Hello, world!");
        }
        System.out.println("");

        // Example 3: Print the multiplication table of 5 up to 10


        System.out.println("\nMultiplication table\n");
        for(int i = 1; i < 11; i++){
            System.out.println(i * 5);
        }
        System.out.println("");

        // Example 4: Print the numbers from 10 to 1 in reverse order
       

        System.out.println("\nReverse loop\n");
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("");

        // Example 5: Print the first 10 even numbers
       
        System.out.println("\nEven numbers\n");
        for(int i = 0; i < 20; i+=2){
            System.out.println(i);
        }
    }
}
