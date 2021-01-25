package by.azapasnik.array.TwoSumIIInputArrayIsSorted_167;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                return new int[]{hm.get(target - nums[i]) + 1, i + 1};
            }
            hm.put(nums[i], i);
        }
        return new int[0];
    }
}
