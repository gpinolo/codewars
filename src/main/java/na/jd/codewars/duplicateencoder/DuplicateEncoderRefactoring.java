package na.jd.codewars.duplicateencoder;

import java.util.stream.Collectors;

class DuplicateEncoderRefactoring {

    static String encode(String input) {
        String lowerInput = input.toLowerCase();
        return  lowerInput.chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(c -> isUnique(lowerInput, c) ? "(" : ")")
                .collect(Collectors.joining());
    }

    private static boolean isUnique(String word, String c) {
        return word.indexOf(c) == word.lastIndexOf(c);
    }
}

