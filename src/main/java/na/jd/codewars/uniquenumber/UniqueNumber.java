package na.jd.codewars.uniquenumber;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class UniqueNumber {

    public static double findUniq(double arr[]){
        Map<Double, Long> countingMap = Arrays.stream(arr).boxed().collect(groupingBy(identity(), counting()));
        return countingMap.entrySet().stream().filter(element -> element.getValue() == 1).findFirst().get().getKey();
    }

}
