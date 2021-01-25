package by.azapasnik.array.RemoveDuplicatesFromSortedArray_26;

public class Solution_2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = 1;
        int currentNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentNumber != nums[i]) {
                currentNumber = nums[i];
                nums[len] = currentNumber;
                len++;
            }
        }

        return len;
    }
}
