public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //     //int hrs = hourOfDay;

        //     if(hourOfDay, int 0 >= 23){
        //         return false;

        //     }else(hourOfDay == valid){
        //         System.out.println(Sam + "should wake up");

        //     }else if(Sam > 23){
        //         return true;
        //     }


        //     // if(Sam <= int 23 hrs);
        //     //     Math.Sam(hourOfDay > 23);

        //     return false;
        //         System.out.println(Sam + "He's not barking");

        //      if(Sam < 0 || Sam > 23);
        //      return false;
        //         System.out.println("Invalid input");

        // }
        // return true;

        // if the hourOfDay is less than 0 or greater than 23, it's not
        // valid, so return false

        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        // if the dog is barking, and it's before 8am or after 10pm,
        // then you should wake up.

        return barking && (hourOfDay < 8 || hourOfDay > 22);

    }
}


