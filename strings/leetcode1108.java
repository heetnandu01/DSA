package DSA.strings;

//1108 - Defanging an IP Address
//leetcode link:https://leetcode.com/problems/defanging-an-ip-address/description/

public class leetcode1108 {
     public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < address.length();i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                sb.append("[.]");
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
