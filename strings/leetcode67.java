package DSA.strings;

// 67 - Add Binary
// leetcode link: https://leetcode.com/problems/add-binary/description/

public class leetcode67 {
      public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >= 0 || carry > 0){
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int total = bitA + bitB + carry;
            result.append(total % 2);
            carry = total / 2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
