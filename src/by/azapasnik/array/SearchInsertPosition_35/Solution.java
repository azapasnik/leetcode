package by.azapasnik.array.SearchInsertPosition_35;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        return findPosition(nums, target, 0, nums.length);
    }

    private int findPosition(int[] nums, int target, int start, int end) {
        int middle = (end + start) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            if (middle == 0) {
                return middle;
            }
            return findPosition(nums, target, start, middle);
        } else {
            if (middle + 1 != end && nums[middle + 1] > target) {
                return middle + 1;
            }
            if (middle == start) {
                return end;
            }
            return findPosition(nums, target, middle, end);
        }
    }
}
