package na.jd.codewars.enoughisenough;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnoughIsEnoughTest {
    @Test
    public void deleteNth() throws Exception {
        assertEquals(new int[]{20,37,21}, EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1));
        assertEquals(new int[]{1, 1, 3, 3, 7, 2, 2, 2}, EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3));
    }

}