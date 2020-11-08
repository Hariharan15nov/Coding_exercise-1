public class MinutesToYearsandDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int years= (int)minutes / (24*60*365);
            int bals=(int)minutes % (24*60*365);
            int days=(int)bals / (24*60);
            System.out.println(minutes + " min = " + years +" y " + days + " d ");
        }
    }
}
