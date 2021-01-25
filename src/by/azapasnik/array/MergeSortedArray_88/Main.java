package by.azapasnik.array.MergeSortedArray_88;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        new Solution().merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

}
