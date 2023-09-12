public class workbook34 {
    public static void main(String[] args) {
        int temp = 25;
        String forecast = "";

        

        if (temp <= -1){
            forecast = "The forecast is FREEZING! Stay home!";
        }else if(temp <= 10){
            forecast = "The forecast is Chilly. Wear a coat!";
        }else{
            System.out.println("It's warm. Go outside!");
        }

        System.out.println(forecast);
    }
}
