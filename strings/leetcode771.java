package DSA.strings;

//771:Jewels and stones
//leetcode link:https://leetcode.com/problems/jewels-and-stones/description/


public class leetcode771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
