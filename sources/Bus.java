public class Bus {
    public static void main(String[] args) {

        //WRONG

        /*int passengers = 0;
        passengers = passengers + 9;
        System.out.println(passengers);
        passengers = passengers - 5;
        System.out.println(passengers);
        passengers = passengers - 4;
        System.out.println(passengers);
        */

        //CORRECT
        /* 
        int passengers = 0;
        passengers += 9;
        System.out.println(passengers);
        passengers -= 5;
        System.out.println(passengers);
        passengers -= 4;
        System.out.println(passengers);
        */
    }
}
