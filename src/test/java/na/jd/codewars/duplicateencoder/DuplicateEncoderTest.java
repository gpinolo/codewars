package na.jd.codewars.duplicateencoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {
    @Test
    public void encodeRefactoring() throws Exception {
        assertEquals(")()())()(()()(", DuplicateEncoderRefactoring.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoderRefactoring.encode("   ()(   "));
        assertEquals("))",DuplicateEncoderRefactoring.encode("(("));
    }

    @Test
    public void encode() throws Exception {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
        assertEquals("))",DuplicateEncoder.encode("(("));
    }

}