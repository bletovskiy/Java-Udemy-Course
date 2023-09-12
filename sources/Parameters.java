public class Parameters {
    public static void main(String[] args) {
        calculateArea(5, 3.5);
        calculateArea(3, 3);
        calculateArea(5, 5);
    }

    public static void calculateArea(double lenght, double width){
        double area = lenght * width;
        System.out.println("Area: " + area);
        //System.out.println("Area: " + lenght * width);
    }
}
