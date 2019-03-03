package na.jd.codewars.uniquenumber;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumberRepeat1 {

    //Increase performance
    public static double findUniq(double arr[]) {
        List<Double> duplicated = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean duplicatedPresent = false;
            if(duplicated.contains(arr[i])){
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicatedPresent = true;
                    duplicated.add(arr[j]);
                    break;
                }
            }
            if (!duplicatedPresent)
                return arr[i];
        }
        throw new IllegalArgumentException("There are not unique double in input array");
    }
}
