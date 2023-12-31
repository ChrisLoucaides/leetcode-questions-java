package problem3;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seenCharacters = new HashSet<>();
        int lengthOfLongestSubStringSoFar = 0;
        int startOfSubstring = 0;

        for (int index = 0; index < s.length(); index++) {
            char character = s.charAt(index);

            while (seenCharacters.contains(character)) {
                seenCharacters.remove(s.charAt(startOfSubstring));
                startOfSubstring++;
            }

            seenCharacters.add(character);
            lengthOfLongestSubStringSoFar = Math.max(lengthOfLongestSubStringSoFar, index - startOfSubstring + 1);
        }

        return lengthOfLongestSubStringSoFar;
    }
}
