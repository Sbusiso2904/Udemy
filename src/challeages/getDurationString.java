package challeages;
public class  Main{
    public static void main  (String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
    }
    public static String getDurationString(int seconds){

        if (seconds  < 0){
            return "Invalid data for seconds("
                    + seconds + "). moust be positive integer value";
        }

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);

//        //Two step approach to get hours
//        int minutes = seconds / 60;
//        int hours = minutes / 60;
//        //System.out.println("hours ="+hours);
//
//        int remainingMinutes = minutes % 60;
//        System.out.println("minutes ="+minutes);
//     System.out.println("remainingMinutes ="+remainingMinutes);
//
//        int remainingMinutes = seconds % 60;
//
//        System.out.println("remainingSeconds ="+remainingSeconds);
//
//        //One step approach to get hours
//            int hours1 = minutes + seconds / 3600;
//            System.out.println("hours1 = " + hours1);
//
//        return hours + "h" + remainingMinutes +"m" + remainingSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds){
        if (seconds  < 0){
            return "Invalid data for seconds("
                    + seconds + "). moust be positive integer value";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";
    }
}

