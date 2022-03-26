package by.azapasnik.hashtable.JewelsAndStones_771;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewMap = new HashSet<>(jewels.length());
        for (char j : jewels.toCharArray()) {
            jewMap.add(j);
        }
        int result = 0;
        for (char s : stones.toCharArray()) {
            if (jewMap.contains(s)) {
                result++;
            }
        }
        return result;
    }
}