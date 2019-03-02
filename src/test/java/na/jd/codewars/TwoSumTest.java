package na.jd.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest
{
    @Test
    public void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    private void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] result = Solution.twoSum(numbers, target);
        if ( null == result )
        {
            System.out.format("Received a null\n");
            assertNotNull(null);
        }
        if ( result.length != 2 )
        {
            System.out.format("Received an array that's not of length 2\n");
            assertTrue(false);
        }
        int received = numbers[result[0]] + numbers[result[1]];
        assertEquals(target, received);
    }
}