public class Main {
    public static void main(String[] args) {
        SpeedConverter.toMilesPerHour(1.5);
        SpeedConverter.printConversion(1.5);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        BarkingDog.shouldWakeUp(true,1);
        leapYear.isLeapYear(2020);
        DecimalComparator.areEqualByThreeDecimalPlaces(23.345,23.345);
        EqualSumChecker.hasEqualSum(1,1,2);
        TeenNumberChecker.hasTeen(12,15,23);
        TeenNumberChecker.isTeen(19);
        AreaCalculator.area(2);
        AreaCalculator.area(2,4);
        MinutesToYearsandDaysCalculator.printYearsAndDays(561600);
        EqualityPrinter.printEqual(1,1,1);
        PlayingCat.isCatPlaying(true,10);
    }
}
