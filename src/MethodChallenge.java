public class MethodChallenge {
    public static void main(String[] args) {

    }

    public static void displayHighScorePosition( String playerName, int player_position){
        int displayHighScorePosition = CalculateHighSorePosition(player_position)

        System.out.println (playerName + " Tim managed to get into position " + player_position + " on the high score list");

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

