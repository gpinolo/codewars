package na.jd.codewars.uniquenumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueNumberRepeat1Test {

    private double precision = 0.0000000000001;

    @Test
    public void find() throws Exception {
        assertEquals(3.0, UniqueNumberRepeat1.findUniq(new double[]{4, 4, 1, 1, 1, 3}), precision);
        assertEquals(3.0, UniqueNumberRepeat1.findUniq(new double[]{1, 2, 4, 3, 1, 4, 1, 1, 2, 1, 4}), precision);
        assertEquals(3.0, UniqueNumberRepeat1.findUniq(new double[]{2, 1, 2, 1, 3}), precision);
        assertEquals(1.0, UniqueNumberRepeat1.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, UniqueNumberRepeat1.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

}