public class loop2DArrays {
    public static void main(String[] args) {
        int [][] grades = {
            {72, 74, 78,76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        for (int j = 0; j < grades[0].length; j++){
            System.out.print(grades[0][j] + " "); //[0][0] [0][1] [0][2]

        }
        System.out.print("\n");
        for (int j = 0; j < grades[1].length; j++){
            System.out.print(grades[1][j] + " "); //[1][0] [1][1] [1][2]

        }
        System.out.print("\n");
        for (int j = 0; j < grades[2].length; j++){
            System.out.print(grades[2][j] + " "); //[2][0] [2][1] [2][2]

        }
        System.out.print("\n");
    }
}
