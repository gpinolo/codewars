package na.jd.codewars.enoughisenough;

import java.util.*;

class EnoughIsEnough {
    static int[] deleteNth(int[] input, int occurence) {
        Map<Integer, Integer> howManyAdd = new HashMap<>();
        List<Integer> outputList = new ArrayList<>();
        Arrays.stream(input).forEach(element -> {
            Integer count = howManyAdd.get(element);
            if (count == null || count < occurence) {
                outputList.add(element);
                howManyAdd.put(element, count != null ? count + 1 : 1);
            }
        });
        return convert(outputList);
    }

    private static int[] convert(List<Integer> outputList) {
        int size = outputList.size();
        int[] result = new int[size];
        Integer[] temp = outputList.toArray(new Integer[size]);
        for (int n = 0; n < size; ++n) {
            result[n] = temp[n];
        }
        return result;
    }
}
