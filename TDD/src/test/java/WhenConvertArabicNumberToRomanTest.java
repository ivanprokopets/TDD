import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRomanTest {
    @Test
    public void Convert_0_To_EmptyString() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(0);
        assertEquals("", romanNumber);
    }

    @Test
    public void Convert_1_To_I() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void Convert_2_To_II() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void Convert_3_To_III() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(3);
        assertEquals("III", romanNumber);
    }


    @Test
    public void Convert_4_To_IV() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(4);
        assertEquals("IV", romanNumber);
    }

    @Test
    public void Convert_5_To_V() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(5);
        assertEquals("V", romanNumber);
    }

    @Test
    public void Convert_6_To_VI() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(6);
        assertEquals("VI", romanNumber);
    }

    @Test
    public void Convert_7_To_VII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(7);
        assertEquals("VII", romanNumber);
    }

    @Test
    public void Convert_8_To_VIII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(8);
        assertEquals("VIII", romanNumber);
    }

    @Test
    public void Convert_9_To_IX() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(9);
        assertEquals("IX", romanNumber);
    }

    @Test
    public void Convert_10_To_X() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(10);
        assertEquals("X", romanNumber);
    }
}