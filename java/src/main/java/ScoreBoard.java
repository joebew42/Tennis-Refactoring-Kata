
public class ScoreBoard {

    private String player1Name;
    private String player2Name;
    private int score1 = 0;
    private int score2 = 0;

    public ScoreBoard(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void incrementScoreFor(String playerName) {
        if (playerName == "player1") {
            incrementScore1();
        } else {
            incrementScore2();
        }
    }

    private void incrementScore2() {
        score2 += 1;
    }

    private void incrementScore1() {
        score1 += 1;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }


}
