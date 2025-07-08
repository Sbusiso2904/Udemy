package challeages;

import java.util.Scanner;

public class min_max {
    Scanner scanner = new Scanner(System.in);
    double min = 0;
    double max = 0;
    int loopcount = 0;

    while(true){
        System.out.println("Enter a number or any character to exit ");
        String nextEntry = scanner.nextLine();
        try {
            double validNum = Double.parseDouble(nextEntry);
            if (validNum < min || validNum > max) {}
        } catch (NumberFormatException nfe) {
            break;
        }
    }

}
