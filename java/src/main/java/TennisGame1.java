
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;
    private FormatterFactory formatterFactory;

    public TennisGame1(String player1Name, String player2Name) {
        this(player1Name, player2Name, new FormatterFactory());
    }

    public TennisGame1(String player1Name, String player2Name, FormatterFactory formatterFactory) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.formatterFactory = formatterFactory;
    }

    public void wonPoint(String playerName) {
        incrementScoreFor(playerName);
    }

    private void incrementScoreFor(String playerName) {
        if (playerName == "player1") {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    public String getScore() {
        int score1 = m_score1;
        int score2 = m_score2;

        Formatter formatter = formatterFactory.buildFor(score1, score2);

        return formatter.format();
    }

}
