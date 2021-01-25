package by.azapasnik.array.RemoveElement_27;


public class Main {

    public static void main(String[] args) {
//        int[] nums = {3,2,2,3};
        int[] nums = {0,1,2,2,3,0,4,2};
        int len = new Solution_2().removeElement(nums, 2);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
