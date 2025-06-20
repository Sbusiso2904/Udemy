package Coding_Exercises;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int year, int month) {
//        year = (1 -9999);

        if (year < 1 || year < 9999){
            return -1;
       }
//        else (!== year){
//            return false;
//        }

//        int month = year;
        return switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // for any of the following months, returns 31
            case 2 -> isleapYear(year) ? 29 : 28; // if it's Feb determine if it's a leap year first, then return either 28 or 29.

            case  4, 6, 9

        }

    }

    public static boolean isleapYear(int year) {


    }




}
