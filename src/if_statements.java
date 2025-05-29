public class if_statements {

    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100 );

        calculateScore(true, 10000, 8, 200);

    }

    public static  int calculateScore(boolean gameOver, int score, int leveCompleted, int bonus_score){

        int final_score = score;

        if (gameOver){
            int finalScore = (leveCompleted * bonus_score);
            finalScore += 1000;
            System.out.println("Your final score is "+ finalScore);
        }
        return  final_score;

    }
}
