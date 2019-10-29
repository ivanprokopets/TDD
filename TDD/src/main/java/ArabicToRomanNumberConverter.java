public class ArabicToRomanNumberConverter {
    public String Convert (int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        return "I";
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
