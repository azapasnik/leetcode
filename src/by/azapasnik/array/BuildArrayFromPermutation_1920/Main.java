package by.azapasnik.array.BuildArrayFromPermutation_1920;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] nums = {0,2,1,5,3,4}; // 0 1 2 4 5 3
        int[] nums = {4,2,1,0,3}; // 3 1 2 4 0

        int[] result = new Solution().buildArray(nums);

        System.out.println(Arrays.toString(result));
    }

}
