package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

//904 - Fruit into Baskets
//leetcode link:https://leetcode.com/problems/fruit-into-baskets/description/?envType=daily-question&envId=2025-08-04

public class leetcode904 {
     public int totalFruit(int[] fruits) {
        int start = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        int maxfruits = 0;
        for (int end = 0; end < fruits.length; end++) {
            hash.put(fruits[end], hash.getOrDefault(fruits[end], 0) + 1);
            while (hash.size() > 2) {
                hash.put(fruits[start], hash.get(fruits[start]) - 1);
                if (hash.get(fruits[start]) == 0) {
                    hash.remove(fruits[start]);
                }
                start++;
            }
            maxfruits = Math.max(maxfruits, end - start + 1);
        }
        return maxfruits;
    }
}
