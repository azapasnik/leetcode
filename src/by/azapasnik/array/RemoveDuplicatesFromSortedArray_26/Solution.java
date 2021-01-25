package by.azapasnik.array.RemoveDuplicatesFromSortedArray_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            int numsToRemove = 0;
            int tempLen = len;
            for (int j = i + 1; j < tempLen && nums[i] == nums[j]; j++) {
                len--;
                numsToRemove++;
            }

            for (int j = i + numsToRemove; j < nums.length; j++) {
                nums[j - numsToRemove] = nums[j];
            }
        }

        return len;
    }
}
