package challeages;

public class DayOfWeek {

    public static void main (String[] args) {
    }

    public static void printDayOfWeek(int day){



            String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid DAy";
        };
            System.out.println(day + "stands for" + dayOfWeek);
    }
}
