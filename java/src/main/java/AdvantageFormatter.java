public class AdvantageFormatter implements Formatter {

    private int score1;
    private int score2;

    public AdvantageFormatter(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public String output() {
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

}
