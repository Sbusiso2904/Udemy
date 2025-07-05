package challeages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromConsole(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        //Parsing values and reading console input-system.console() overview

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi" + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("Whats years were you born? ");
        int age =  currentYear - Integer.parseInt(dateOfBirth);

        return "So you are" + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {
`
        //Handling Exceptions and introducing the scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year wer you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >=" +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed!!! try again.");
            }
        } while (!validDOB);

        return "So you are " + age + "years old";

    }


    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        return dob;
    }
}
