public class Waather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }
    public static double fahrenheitToCelsium(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static void printTemperatures(double fahrenheit){
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsium(fahrenheit) + "\n");
    }
}
