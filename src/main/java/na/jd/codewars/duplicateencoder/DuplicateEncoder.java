package na.jd.codewars.duplicateencoder;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DuplicateEncoder {

    static String encode(String word) {
        String[] chars = word.toLowerCase().split("");
        StringBuilder encoded = new StringBuilder();

        Map<String, Long> occourenceMap = Arrays.stream(chars)
                .collect(groupingBy(Function.identity(), counting()));

        Arrays.stream(chars).forEach(aChar -> {
            Long occurence = occourenceMap.get(aChar);
            encoded.append(occurence > 1 ? ")" : "(");
        });
        return encoded.toString();
    }
}
