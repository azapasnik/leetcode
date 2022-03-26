package by.azapasnik.hashtable.JewelsAndStones_771;

public class Main {

    public static void main(String[] args) {
        String jewels = "nNh"; String stones = "fnHrN"; //2
//        String jewels = "a"; String stones = "fbyrF"; //0
//        String jewels = "asdqwe"; String stones = ""; //0

        int sum = new Solution().numJewelsInStones(jewels, stones);

        System.out.println(sum);
    }

}
