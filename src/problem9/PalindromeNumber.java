package problem9;

public class PalindromeNumber { //An example solution
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String stringToCheck = Integer.toString(x);
        int length = stringToCheck.length();

        for (int i = 0; i < length / 2; i++) {
            if (stringToCheck.charAt(i) != stringToCheck.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
