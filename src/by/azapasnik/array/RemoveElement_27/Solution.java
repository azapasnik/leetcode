package by.azapasnik.array.RemoveElement_27;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int len = 0;
        int numRemoved = 0;
        for (int i = 0; i < nums.length - numRemoved; i++) {
            if (nums[i] == val) {
                if (i + 1 < nums.length - numRemoved) {
                    for (int j = i + 1; j < nums.length - numRemoved; j++) {
                        nums[j - 1] = nums[j];
                    }
                    numRemoved++;
                    i--;
                }
            } else {
                len++;
            }

        }

        return len;
    }
}
