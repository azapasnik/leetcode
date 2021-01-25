package by.azapasnik.array.TwoSum_1;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        long result = 0;
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int f = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int s = nums[j];
                long sum = f + s;
                if (sum == target) {
                    return new int[]{i, j};
                }
                if (sum > result && sum <= target) {
                    res1 = i;
                    res2 = j;
                    result = sum;
                }
            }
        }
        return new int[]{res1, res2};
    }
}
