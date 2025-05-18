//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Akha!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }


        int topscore = 80;
        if (topscore < 100){
            System.out.println("You got the high score");
        }

        int secondTopscore = 95 ;
        if ((topscore > secondTopscore) && ( topscore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }


        if ((topscore > 90) || (secondTopscore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
         if(newValue == 50){
             System.out.println("This is true");
         }

         boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }


        double FirstVar = 20.00d;
        double SecondVar = 80.00d ;
        double ValueTotal = FirstVar + SecondVar * 100.00;{
            System.out.println(ValueTotal);
        double theRemainder = ValueTotal % 40.00d;
            System.out.println("Remainder =" + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
        }
    }
}