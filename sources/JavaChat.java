import java.util.Scanner;

public class JavaChat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", I'm JavaChat. Where are you from?");
        String city = scanner.nextLine();
        System.out.println("I hear it's beautiful in " + city + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); // Дополнительный вызов scanner.nextLine() для чтения символа новой строки
        System.out.println("So you're " + age + ", cool! I'm 400 years old");
        System.out.println("This means I'm " + ((float) 400 / age) + " times older than you");

        System.out.println("Enough about me. What's your favourite language? (Just don't say Python)");

        String language = scanner.nextLine();
        System.out.println(language + ", that's great! Nice chatting with you, " + name + ". I have to log off now. See ya!");

        scanner.close();
    }
}
