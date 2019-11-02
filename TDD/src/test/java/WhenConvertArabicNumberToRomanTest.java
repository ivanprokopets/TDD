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

    @Test
    public void Convert_11_To_XI() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(11);
        assertEquals("XI", romanNumber);
    }

    @Test
    public void Convert_12_To_XII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(12);
        assertEquals("XII", romanNumber);
    }

    @Test
    public void Convert_13_To_XIII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(13);
        assertEquals("XIII", romanNumber);
    }

    @Test
    public void Convert_14_To_XIV() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(14);
        assertEquals("XIV", romanNumber);
    }

    @Test
    public void Convert_15_To_XV() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(15);
        assertEquals("XV", romanNumber);
    }

    @Test
    public void Convert_16_To_XVI() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(16);
        assertEquals("XVI", romanNumber);
    }

    @Test
    public void Convert_17_To_XVII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(17);
        assertEquals("XVII", romanNumber);
    }

    @Test
    public void Convert_18_To_XVIII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(18);
        assertEquals("XVIII", romanNumber);
    }

    @Test
    public void Convert_19_To_XIX() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(19);
        assertEquals("XIX", romanNumber);
    }

    @Test
    public void Convert_20_To_XX() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(20);
        assertEquals("XX", romanNumber);
    }

    @Test
    public void Convert_21_To_XXI() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(21);
        assertEquals("XXI", romanNumber);
    }

    @Test
    public void Convert_22_To_XXII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(22);
        assertEquals("XXII", romanNumber);
    }

    @Test
    public void Convert_23_To_XXIII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(23);
        assertEquals("XXIII", romanNumber);
    }

    @Test
    public void Convert_24_To_XXIV() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(24);
        assertEquals("XXIV", romanNumber);
    }

    @Test
    public void Convert_25_To_XXV() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(25);
        assertEquals("XXV", romanNumber);
    }

    @Test
    public void Convert_39_To_XXXIX() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(39);
        assertEquals("XXXIX", romanNumber);
    }

    @Test
    public void Convert_40_To_XL() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(40);
        assertEquals("XL", romanNumber);
    }

    @Test
    public void Convert_41_To_XLI() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(41);
        assertEquals("XLI", romanNumber);
    }

    @Test
    public void Convert_50_To_L() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(50);
        assertEquals("L", romanNumber);
    }

    @Test
    public void Convert_51_To_LI() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(51);
        assertEquals("LI", romanNumber);
    }

    @Test
    public void Convert_60_To_LX() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(60);
        assertEquals("LX", romanNumber);
    }

    @Test
    public void Convert_90_To_XC() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(90);
        assertEquals("XC", romanNumber);
    }

    @Test
    public void Convert_100_To_C() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(100);
        assertEquals("C", romanNumber);
    }

    @Test
    public void Convert_400_To_CD() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(400);
        assertEquals("CD", romanNumber);
    }

    @Test
    public void Convert_500_To_D() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(500);
        assertEquals("D", romanNumber);
    }

    @Test
    public void Convert_900_To_CM() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(900);
        assertEquals("CM", romanNumber);
    }

    @Test
    public void Convert_1451_To_MCDLI() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(1451);
        assertEquals("MCDLI", romanNumber);
    }
    @Test
    public void Convert_208_To_CCVIII() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(208);
        assertEquals("CCVIII", romanNumber);
    }

    @Test
    public void Convert_1995_To_MCMXCV() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(1995);
        assertEquals("MCMXCV", romanNumber);
    }

    @Test
    public void Convert_2000_To_MM() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(2000);
        assertEquals("MM", romanNumber);
    }

    @Test
    public void Convert_2019_To_MMXIX() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(2019);
        assertEquals("MMXIX", romanNumber);
    }

    @Test
    public void Convert_4994_To_MMMMCMXCIV() {
        String romanNumber = ArabicToRomanNumberConverter.toRoman(4994);
        assertEquals("MMMMCMXCIV", romanNumber);
    }
}