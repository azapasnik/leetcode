package by.azapasnik.array.RemoveDuplicatesFromSortedArray_26;

public class Main {

    public static void main(String[] args) {
        int[] input = {1,1,2,2};
//        int[] input = {1,1,2};
//        int[] input = {1,1,1};
//        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = new Solution_2().removeDuplicates(input);
        for (int i = 0; i < len; i++) {
            System.out.print(input[i] + " ");
        }
    }

}
