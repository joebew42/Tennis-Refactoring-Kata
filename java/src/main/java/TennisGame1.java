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

        if (score1 == score2) {
            return dueceFormatterFormat(score1, score2);
        }

        if (score1 > 3 || score2 > 3) {
            return advantageFormatterFormat(score1, score2);
        }

        return defaultFormatterFormat(score1, score2);
    }

    private String defaultFormatterFormat(int score1, int score2) {
        return formatScore(score1) + "-" + formatScore(score2);
    }

    private String formatScore(int score) {
        switch (score) {
        case 0:
            return "Love";
        case 1:
            return "Fifteen";
        case 2:
            return "Thirty";
        case 3:
            return "Forty";
        default:
            return "";
        }
    }

    private String advantageFormatterFormat(int score1, int score2) {
        int difference = score1 - score2;

        if (difference == 1) {
            return "Advantage player1";
        }

        if (difference == -1) {
            return "Advantage player2";
        }

        if (difference >= 2) {
            return "Win for player1";
        }

        return "Win for player2";
    }

    private String dueceFormatterFormat(int score1, int score2) {
        switch (score1) {
        case 0:
            return "Love-All";
        case 1:
            return "Fifteen-All";
        case 2:
            return "Thirty-All";
        default:
            return "Deuce";
        }
    }
}
