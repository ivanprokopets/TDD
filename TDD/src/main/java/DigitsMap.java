import java.util.ArrayList;

public class DigitsMap {

    public final ArrayList<PairOfDigitis> digitis;

    public DigitsMap() {
        digitis = new ArrayList<PairOfDigitis>();
        digitis.add(new PairOfDigitis(1000, 'M'));
        digitis.add(new PairOfDigitis(500, 'D'));
        digitis.add(new PairOfDigitis(100, 'C'));
        digitis.add(new PairOfDigitis(50, 'L'));
        digitis.add(new PairOfDigitis(10, 'X'));
        digitis.add(new PairOfDigitis(5, 'V'));
        digitis.add(new PairOfDigitis(1, 'I'));
    }

    public char nextDigit(char digit) {
        for (int i = 0; i < digitis.size(); i++) {
            if (digitis.get(i).getRoman() == digit) {
                return digitis.get(i - 1).getRoman();
            }
        }
        return digit;
    }
}
