public class MethodChallenge {
    public static void main(String[] args) {
        int displayHighScorePosition = CalculateHighSorePosition(1500);
        displayHighScorePosition( "Tim", displayHighScorePosition);

        displayHighScorePosition = CalculateHighSorePosition(1000);
        displayHighScorePosition( "Sbu", displayHighScorePosition);

        displayHighScorePosition = CalculateHighSorePosition(500);
        displayHighScorePosition( "Sbo", displayHighScorePosition);

        displayHighScorePosition = CalculateHighSorePosition(25);
        displayHighScorePosition( "Sam", displayHighScorePosition);

    }

    public static void displayHighScorePosition( String playerName, int player_position){

        System.out.println (playerName + " managed to get into position " + player_position + " on the high score list");

    }

    public  static int CalculateHighSorePosition(int player_score){
        //return  int highScorePosition = 1 && 4;

        if(player_score >= 1000) {
            return 1;
        } else if(player_score >= 500 && player_score < 1000){
            return 2;
        } else if(player_score >= 100 && player_score < 500){
            return 3;
        } else {
            return 4;

        }
    }
}

