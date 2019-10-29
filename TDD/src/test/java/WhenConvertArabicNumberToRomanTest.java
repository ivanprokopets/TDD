import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRomanTest {
    private String convertToRoman(int arabicNumber) {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        return converter.Convert(arabicNumber);
    }

    @Test
    public void Convert_0_To_EmptyString() {
        String romanNumber = convertToRoman(0);
        assertEquals("", romanNumber);
    }

    @Test
    public void Convert_1_To_I() {
        String romanNumber = convertToRoman(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void Convert_2_To_II() {
        String romanNumber = convertToRoman(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void Convert_3_To_III() {
        String romanNumber = convertToRoman(3);
        assertEquals("III", romanNumber);
    }
}