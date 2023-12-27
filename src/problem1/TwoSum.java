package problem1;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seenNumbers.contains(complement)) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == complement) {
                        return new int[]{j, i};
                    }
                }
            }
            seenNumbers.add(nums[i]);
        }
        throw new IllegalArgumentException("No solution found");
    }
}
