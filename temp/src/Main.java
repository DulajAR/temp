public class Main {
   static int tempC;
    static int tempF;
    static String txt;
    static String date;

    public static void converter(int tempC, int day) {
        tempF = (tempC * 9/5) + 32;
        if (tempF > 50) {

            txt = "hot";
        }
        else  {
            txt = "cool";
        }
        switch (day) {
            case 1:
                date = "Monday";
                break;
            case 2:
                date = "Tuesday";
                break;
            case 3:
                date = "Wednesday";
                break;
            case 4:
                date = "Thursday";
                break;
            case 5:
                date = "Friday";
                break;
            case 6:
                date = "Saturday";
                break;
            case 7:
                date = "Sunday";
                break;
        }
        System.out.println("It's " + date + "and it's " + txt + ".");

    }




    public static void main(String[] args) {
        converter(25,1);
    }

}