import java.util.ArrayList;

public class ArabicToRomanNumberConverter {

    public static String toRoman(int arabicNumber) {
        String romanNumber = getRomanNumber(arabicNumber);
        romanNumber = romanNumber.replace("IIII","IV");
        return romanNumber;
    }
    private static String getRomanNumber(int arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();

        ArrayList<PairOfDigitis> digitis = new ArrayList<PairOfDigitis>();
        digitis.add(new PairOfDigitis(5, 'V'));
        digitis.add(new PairOfDigitis(1, 'I'));

        for (PairOfDigitis digit : digitis) {
            while (arabicNumber >= digit.getArabic()) {
                romanNumber.append(digit.getRoman());
                arabicNumber -= digit.getArabic();
            }
        }
        //romanNumber = romanNumber.replace("IIII", "IV");
        return romanNumber.toString();
    }
}
