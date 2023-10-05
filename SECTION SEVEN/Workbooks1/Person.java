package Workbooks1;

import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
    

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        
    }

    public String getName(){
        return name;
    }
    public String getNationality(){
        return nationality;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public int getSeatNumber(){
        return seatNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public String[] getPassport(){
        return Arrays.copyOf(passport, passport.length);
    }

    public void setPassport(){
        passport[0] = name;
        passport[1] = nationality;
        passport[2] = dateOfBirth;

        passport = new String[] {name, nationality, dateOfBirth};
    }

    public String toString(){
        return ("Name: " + this.name + "\n" + "Natinality: " + this.nationality + "\n" + 
        "Date of Birth: " + this.dateOfBirth + "\n" + "Seat number: "+ this.seatNumber + "\n" + 
        "Passport: " + Arrays.toString(passport));
    }

    public boolean applyPassport(){
        int number = (int) (Math.random() * 2);  //random int that can be 0 or 1.
        
        return number == 1;
    }       
    

    public void chooseSeat(){
        seatNumber = (int) (Math.random() * 11 + 1);  
    }
}