
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
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

        Formatter formatter = buildFormatterFor(score1, score2);

        return formatter.format(score1, score2);
    }

    private Formatter buildFormatterFor(int score1, int score2) {
        if (score1 == score2) {
            return new DeuceFormatter();
        }

        if (score1 > 3 || score2 > 3) {
            return new AdvantageFormatter();
        }

        return new DefaultFormatter();
    }

}
