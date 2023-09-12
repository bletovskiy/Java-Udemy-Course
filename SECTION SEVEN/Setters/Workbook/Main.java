package Setters.Workbook;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        System.out.println("Name: " + person.getName());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Seat Number: " + person.getSeatNumber());

        System.out.println("\n");

        person.setName("Rayan Gosling");
        person.setNationality("Ukrainian");
        person.setDateOfBirth("02/02/2002");
        person.setSeatNumber(5);

        System.out.println("New name : " + person.getName() + "\n" + "New nationality : " + person.getNationality() + "\n" + "New Date of Birth: " + person.getDateOfBirth() + "\n" + "New Seat number: " + person.getSeatNumber());


    }
}
