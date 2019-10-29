import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRomanTest {
    @Test
    public void Convert_0_To_EmptyString() {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        String romanNumber = converter.Convert(0);
        assertEquals("", romanNumber);
    }

    @Test
    public void Convert_1_To_I() {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        String romanNumber = converter.Convert(1);
        assertEquals("I", romanNumber);
    }
}