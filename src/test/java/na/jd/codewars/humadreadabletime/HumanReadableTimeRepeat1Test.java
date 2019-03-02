package na.jd.codewars.humadreadabletime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeRepeat1Test {
    @Test
    public void Tests() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTimeRepeat1.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTimeRepeat1.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTimeRepeat1.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTimeRepeat1.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTimeRepeat1.makeReadable(359999));
    }
}