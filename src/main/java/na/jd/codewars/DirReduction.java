package na.jd.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class DirReduction {

    static List<String> directionCombinationToUndo = Arrays.asList("southnorth", "northsouth", "eastwest", "westeast");

    public static String[] dirReduc(String[] directions) {
        List<String> collect = Arrays.stream(directions).collect(Collectors.toList());
        while (reduce(collect)) {
        }

        return collect.toArray(new String[collect.size()]);
    }

    private static boolean reduce(List<String> directions) {
        for (int i = 0; i < directions.size(); i++) {
            String actualDirection = directions.get(i).toLowerCase();
            try {
                String nextDirection = directions.get(i + 1).toLowerCase();
                if (directionCombinationToUndo.contains(actualDirection + nextDirection)) {
                    directions.remove(i);
                    directions.remove(i);
                    return true;
                }
            } catch (IndexOutOfBoundsException e) {
                return false;
            }
        }
        return false;
    }
}
