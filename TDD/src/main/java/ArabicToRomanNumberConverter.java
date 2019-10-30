public class ArabicToRomanNumberConverter {
    public String Convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        return getRepeatingRomanNumber(arabicNumber);
    }

    private String getRepeatingRomanNumber(int arabicNumber) {
        String romanNumber = "";

        while (arabicNumber >= 1) {
            romanNumber += "I";
            arabicNumber--;
        }
        romanNumber = romanNumber.replace("IIII", "IV");

        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
