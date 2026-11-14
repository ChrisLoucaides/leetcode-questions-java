package problem217;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        // initialize seen number set
        // loop through nums, check if we have seen num
        // if yes, return true
        // else return false

        final Set<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            if (!seenNumbers.add(num)) return true;
        }

        return false;
    }
}
