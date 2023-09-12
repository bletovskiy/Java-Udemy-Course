public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    public Car (String make, int price, int year, String color){
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
    }
    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }

    public String getMake(){
        return make;
    }
    public double getPrice(){
        return price;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void drive(){
        System.out.println("\nYou bought the beautiful" + this.year + "" + this.color + "" + this.make + "" + "for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    

}


