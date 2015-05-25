
public class TennisGame1 implements TennisGame {

    private ScoreBoard scoreBoard;
    private FormatterFactory formatterFactory;

    public TennisGame1(String player1Name, String player2Name) {
        this(new ScoreBoard(player1Name, player2Name), new FormatterFactory());
    }

    public TennisGame1(ScoreBoard scoreBoard, FormatterFactory formatterFactory) {
        this.scoreBoard = scoreBoard;
        this.formatterFactory = formatterFactory;
    }

    public void wonPoint(String playerName) {
        scoreBoard.pointTo(playerName);
    }

    public String getScore() {
        int score1 = scoreBoard.getScore1();
        int score2 = scoreBoard.getScore2();;

        Formatter formatter = formatterFactory.buildFor(score1, score2);

        return formatter.output();
    }

}
