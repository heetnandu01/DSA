package DSA.strings;

//2011 - Final Value of Variable After Performing Operations
//leetcode link:

public class leetcode2011 {
     public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x++;
            }else if(operations[i].equals("--X") || operations[i].equals("X--")){
                x--;
            }
        }
        return x;
    }
}
