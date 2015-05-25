public class AdvantageFormatter implements Formatter {

    public String format(int score1, int score2) {
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
