public class DefaultFormatter implements Formatter {

    private int score1;
    private int score2;

    public DefaultFormatter(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public String format() {
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
