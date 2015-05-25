public class DeuceFormatter implements Formatter {

    private int score;

    public DeuceFormatter(int score) {
        this.score = score;
    }

    public String output() {
        switch (score) {
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
