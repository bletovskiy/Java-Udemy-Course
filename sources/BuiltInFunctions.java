public class BuiltInFunctions {

    public static void main(String[] args) {

        /**
         * Scenario 1
         * 
         * Find a built-in function that prints the message on the console.
         * @param message (String)
         */
        String message = "Hello, World!";
        // Write your code here
        System.out.println(message);


        /**
         * Scenario 2
         * 
         * Find a built-in function that returns the length of a string.
         * @return length (int)
         */
        String example = "Java";
        int lenght = example.length();
        System.out.println(lenght);
        // Write your code here



        /**
         * Scenario 3
         * 
         * Find a built-in function that converts a string to lowercase.
         * @return lowerCase (String)
         */
        String upperCase = "JAVA";
        String lowercaseStr = upperCase.toLowerCase();
        System.out.println("lowercase string: " + lowercaseStr);
        // Write your code here


        /**
         * Scenario 4
         * 
         * Find a built-in function that checks if a string starts with a specified prefix.
         * @param prefix (String)
         * @return startsWithPrefix (boolean)
         */
        String programming = "Java programming";
        String prefix = "Java";
        boolean startsWithPrefix = programming.startsWith(prefix);
        System.out.println("Starts with prefix? " + startsWithPrefix);

        // Write your code here



        /**
         * Scenario 5
         * 
         * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString (String)
         */
        String original = "Java is fun!";
        char oldChar = 'a';
        char newChar = 'o';
        String replacedString = original.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replacedString);

        // Write your code here

        
        /**
         * Scenario 6
         * 
         * Find a built-in function that calculates the square root of a number.
         * @param number (double)
         * @return squareRoot (double)
         */
        
        double number = 9;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root: " + squareRoot);

        // Write your code here


        /**
         * Scenario 7
         * 
         * Find a built-in function that calculates the power of a number.
         * @param base (double)
         * @param exponent (double)
         * @return power (double)
         */
        double base = 2;
        double exponent = 3;
        double power = Math.pow(base, exponent);
        System.out.println("Result: " + power);

        // Write your code here


        /**
         * Scenario 8
         * 
         * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         * @return randomNumber (double)
         */
        double randomNumber = Math.random();
        System.out.println("Random number: " + randomNumber);

        // Write your code here



        /**
         * Scenario 9
         * 
         * Find a built-in function that returns the larger of two numbers.
         * @param number1 (int)
         * @param number2 (int)
         * @return maxNumber (int)
         */
        int number1 = 5;
        int number2 = 10;
        int maxNumber = Math.max(number1, number2);
        System.out.println("Max number: " + maxNumber);

        // Write your code here


    }
}
