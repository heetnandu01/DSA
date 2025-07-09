// binary search

//744 -  Find Smallest Letter Greater Than Target
//leetcode link:https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class leetcode744 {
      public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length -1 ;
        while(low <= high){
            int mid  = low + (high - low)/2;
            if(letters[mid] <= target){
                low = mid + 1;
            }else if(letters[mid] > target){
                high = mid -1;
            }
        }
        return letters[low % letters.length];
    }
}
