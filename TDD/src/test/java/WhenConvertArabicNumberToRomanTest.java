import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhenConvertArabicNumberToRomanTest {
    @Test
    public void Convert_0_To_EmptyString() {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        String romanNumber = converter.Convert(0);
        assertEquals("", romanNumber);
    }
}