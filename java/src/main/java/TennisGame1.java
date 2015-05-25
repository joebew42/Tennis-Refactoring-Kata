
public class TennisGame1 implements TennisGame {

    private String player1Name;
    private String player2Name;
    private ScoreBoard scoreBoard;
    private FormatterFactory formatterFactory;

    public TennisGame1(String player1Name, String player2Name) {
        this(new ScoreBoard(player1Name, player2Name), new FormatterFactory());
    }

    public TennisGame1(ScoreBoard scoreBoard, FormatterFactory formatterFactory) {
        this.scoreBoard = scoreBoard;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.formatterFactory = formatterFactory;
    }

    public void wonPoint(String playerName) {
        incrementScoreFor(playerName);
    }

    private void incrementScoreFor(String playerName) {
        if (playerName == "player1") {
            scoreBoard.incrementScore1();
        } else {
            scoreBoard.incrementScore2();
        }
    }

    public String getScore() {
        int score1 = scoreBoard.getScore1();
        int score2 = scoreBoard.getScore2();;

        Formatter formatter = formatterFactory.buildFor(score1, score2);

        return formatter.output();
    }

}
