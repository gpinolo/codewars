package na.jd.codewars.uniquenumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueNumberTest {

    private double precision = 0.0000000000001;

    @Test
    public void find() throws Exception {
        assertEquals(1.0, UniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, UniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

}