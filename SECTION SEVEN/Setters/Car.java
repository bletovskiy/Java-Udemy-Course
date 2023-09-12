package Setters;

public class Car {
    private int fuelLevel;

    public Car(int fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel(){
        return this.fuelLevel;
    }

    public void setFuellevel(int fuelLevel){
        this.fuelLevel = fuelLevel;
    }
}
