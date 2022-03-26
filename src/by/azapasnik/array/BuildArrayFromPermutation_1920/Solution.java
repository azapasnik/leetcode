package by.azapasnik.array.BuildArrayFromPermutation_1920;

public class Solution {

    //        int[] nums = {0,2,1,5,3,4}; // 0 1 2 4 5 3
    public int[] buildArray(int[] nums) {
        int[] r = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            r[i] = nums[nums[i]];
        }
        return r;
    }
}