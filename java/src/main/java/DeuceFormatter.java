public class DeuceFormatter implements Formatter {

    public String format(int score1, int score2) {
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
