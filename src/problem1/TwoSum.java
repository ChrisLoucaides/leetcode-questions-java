package problem1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//An example solution
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        final HashMap<Integer, Integer> seenNumbersAndPositions = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seenNumbersAndPositions.containsKey(complement)) {
                return new int[]{seenNumbersAndPositions.get(complement), i};
            }
            seenNumbersAndPositions.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

}
