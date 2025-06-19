package Coding_Exercises;

public class NumberOfDaysInMonth {

    public static int getDay(int year) {
        year = (1 -9999);

        if (year <= 1 || year <= 9999){
            return -1;
//        } else (!== year){
//            return false;
//        }

        int month = year;
        switch (month){
            case 0 -> "January";
            case 1 -> "Febrauy";
            case 2 -> "March";
            case 3 -> "April";
            case 4 -> "May";
            case 5 -> "June";
            case 6 -> "July";
            case 7 -> "August";
            case 8 -> "September";
            case 9 -> "October";
            case 10 -> "Novermber";
            case 11 -> "December";
            default -> "Invalid month"
        }

    }




}
