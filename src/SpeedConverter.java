public class SpeedConverter {
    public static int toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }
            return ((int)Math.round(kilometersPerHour / 1.609));
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        int milesPerHour=toMilesPerHour(kilometersPerHour);
        System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
