package Setters;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(100);
        System.out.println(myCar.getFuelLevel());
        myCar.setFuellevel(50);
        System.out.println(myCar.getFuelLevel());
    }
}
