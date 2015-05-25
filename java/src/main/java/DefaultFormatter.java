public class DefaultFormatter implements Formatter {

    public String format(int score1, int score2) {
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

}
