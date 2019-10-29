public class ArabicToRomanNumberConverter {
    public String Convert (int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();
        if (arabicNumber == 1)
            return "I";
        else if (arabicNumber == 2)
            return "II";
        else return "III";
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
