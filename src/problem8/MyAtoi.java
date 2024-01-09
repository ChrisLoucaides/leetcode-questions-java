package problem8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoi { //An example solution
    public int myAtoi(String s) {
        String trimmed = s.trim();
        Matcher matcher = Pattern.compile("^[+-]?\\d+").matcher(trimmed);

        if (matcher.find()) {
            String numberStr = matcher.group();
            try {
                return Integer.parseInt(numberStr);
            } catch (NumberFormatException e) {
                return numberStr.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }
}
