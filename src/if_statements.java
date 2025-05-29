public class if_statements {

    public static void main(String[] args) {
        boolean gameOver = true;
        int  score = 10000;
        int leveCompleted = 8;
        int bonus_score = 200;

        int final_score = score;

        caiculateScore(true, 800, 5, 100 );

        if (gameOver){
            final_score = final_score + (leveCompleted * bonus_score);
            System.out.println("Your final score is "+ final_score);
        }
    }

    public static  void caiculateScore(boolean gameOver, int score, int leveCompleted, int bonus_score){
        boolean gameOver = true;
        int  score = 800 ;
        int leveCompleted = 5;
        int bonus_score = 100;

        int final_score = score;

        if (gameOver){
            int finalScore = (leveCompleted * bonus_score);
            finalScore += 1000;
            System.out.println("Your final score is "+ finalScore);
        }

    }
}
