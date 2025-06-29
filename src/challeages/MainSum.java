package challeages;

public class MainSum {

    public static void main(String[] args) {
        int countofMatches = 0;
        int sumofMatches = 0;

        for (int loopMumber = 1; loopMumber <= 1000; loopMumber++){
            if ((loopMumber % 3 == 0) && (loopMumber % 5 ==0)){
                countofMatches ++;
                sumofMatches += loopMumber;
                System.out.println("Found a match = " + loopMumber);
            }
            if (countofMatches == 5){
                break;
            }
        }


        System.out.println("Sum =" + sumofMatches);
    }


}
