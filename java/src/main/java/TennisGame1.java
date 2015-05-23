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
        if (isDeuce()) {
            int score = m_score1;
            return formatDuece(score);
        }

        if (isAdvantage()) {
            int difference = m_score1 - m_score2;
            return formatAdvantage(difference);
        }

        int score1 = m_score1;
        int score2 = m_score2;
        return format(score1, score2);
    }

    private String format(int score1, int score2) {
        String text = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = score1;
            } else {
                text += "-";
                tempScore = score2;
            }

            text += formatScore(tempScore);
        }
        return text;
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

    private String formatAdvantage(int minusResult) {
        String text = "";
        if (minusResult == 1) {
            text = "Advantage player1";
        } else if (minusResult == -1) {
            text = "Advantage player2";
        } else if (minusResult >= 2) {
            text = "Win for player1";
        } else {
            text = "Win for player2";
        }
        return text;
    }

    private String formatDuece(int score) {
        String text = "";
        switch (score) {
        case 0:
            text = "Love-All";
            break;
        case 1:
            text = "Fifteen-All";
            break;
        case 2:
            text = "Thirty-All";
            break;
        default:
            text = "Deuce";
            break;
        }
        return text;
    }

    private boolean isAdvantage() {
        return m_score1 >= 4 || m_score2 >= 4;
    }

    private boolean isDeuce() {
        return m_score1 == m_score2;
    }
}
