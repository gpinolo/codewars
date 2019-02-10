package na.jd.codewars.morsecode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MorseCodeDecoderTest {
    @Test
    public void decode() throws Exception {
        assertEquals("HEY JUDE",MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }

}