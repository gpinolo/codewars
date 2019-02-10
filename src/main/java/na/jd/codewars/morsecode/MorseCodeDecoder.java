package na.jd.codewars.morsecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {

    private static Map<String, String> morseCode = new HashMap<>();

    public static String decode(String morseMessage) {
        StringBuilder humanLanguage = new StringBuilder();
        String[] morseWords = morseMessage.trim().split("   ");
        Arrays.stream(morseWords).forEach(morseWord-> {
            String[] morseChars = morseWord.split(" ");
            Arrays.stream(morseChars).forEach(morseChar -> humanLanguage.append(morseCode.get(morseChar)));
            humanLanguage.append(" ");
        });

        return humanLanguage.toString().trim();
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
    }

    static {
        morseCode.put(".-","A");
        morseCode.put("-...","B");
        morseCode.put("-.-.","C");
        morseCode.put("-..","D");
        morseCode.put(".","E");
        morseCode.put("..-.","F");
        morseCode.put("--.","G");
        morseCode.put("....","H");
        morseCode.put("..","I");
        morseCode.put(".---","J");
        morseCode.put("-.-","K");
        morseCode.put(".-..","L");
        morseCode.put("--","M");
        morseCode.put("-.","N");
        morseCode.put("---","O");
        morseCode.put(".--.","P");
        morseCode.put("--.-","Q");
        morseCode.put(".-.","R");
        morseCode.put("...","S");
        morseCode.put("-","T");
        morseCode.put("..-","U");
        morseCode.put("...-","V");
        morseCode.put(".--","W");
        morseCode.put("-..-","X");
        morseCode.put("-.--","Y");
        morseCode.put("--..","Z");
    }
}
