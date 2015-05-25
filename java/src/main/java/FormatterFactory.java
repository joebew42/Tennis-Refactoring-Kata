
public class FormatterFactory {

    public Formatter buildFor(int score1, int score2) {
        if (score1 == score2) {
            return new DeuceFormatter();
        }

        if (score1 > 3 || score2 > 3) {
            return new AdvantageFormatter();
        }

        return new DefaultFormatter();
    }

}
