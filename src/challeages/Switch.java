package challeages;

public class Switch {
//    int value = 3;
//    if (value == 1){
//        System.out.println("Value was 1");
//    } else if (value == 2){
//        System.out.println("Value was 2");
//    } else {
//        System.out.println("Was not 1 or 2");
//    }
    int switchValue = 1;

    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Was a 3, a 4, or a ");
            System.out.println("Actually it was a " + switchValue);
            break;

        default:
            System.out.println("Was not 1 or 2");
            break;
    }
    String month  = "April";
    System.out.println(month + "is in the" + getQuarter(month) + " quarter");
}

public static String getQuarter(){

    // Traditional switch statement
    switch (month){
        case  "January":
        case  "Febraury":
        case "March":
            return "1st";

        case "April":
        case "May":
        case "June":
            return "2nd";

        case "July":
        case "August":
        case  "September":
            return "3rd";

        case "October":
        case "November":
        case "December":
             return "4th";


    }
    return  "bad";
}