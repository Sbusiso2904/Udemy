package Coding_Exercises;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour){
        printConversion(kilometerPerHour);


        if(kilometerPerHour < 0){
            return -1;
        }
       return Math.round(kilometerPerHour / 1.609);


    }

    public static void  printConversion(double kilometerPerHour){

        if (kilometerPerHour < 0){
            System.out.println("Invalid value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometerPerHour);
        System.out.println(kilometerPerHour + "km/h" + milesPerHour + "mi/h");

    }
}