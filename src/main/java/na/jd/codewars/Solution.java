package na.jd.codewars;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if(number + numbers[j] == target)
                    return new int[] {i, j};
            }
        }
        return null;
    }
}
