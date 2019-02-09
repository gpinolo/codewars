package na.jd.codewars.enoughisenough;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EnoughIsEnoughTest {
    @Test
    public void deleteNth() throws Exception {
        assertTrue(Arrays.compare(new int[]{20, 37, 21}, EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1)) == 0);
        assertTrue(Arrays.compare(new int[]{1, 1, 3, 3, 7, 2, 2, 2}, EnoughIsEnough.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)) == 0);
    }

}