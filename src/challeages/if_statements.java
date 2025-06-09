package challeages;

public class if_statements {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver, score, levelCompleted, bonus );
        System.out.println("The highScore is " + highscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;





        System.out.println("The next highScore is " +
            calculateScore(gameOver, score, levelCompleted, bonus));

    }

    public static  int calculateScore(boolean gameOver, int score, int leveCompleted, int bonus_score){

        int final_score = score;

        if (gameOver){
            int finalScore = (leveCompleted * bonus_score);
            finalScore += 1000;
        }
        return  final_score;
    }
}
