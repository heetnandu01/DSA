package DSA.strings;

//1832 - Check if the Sentence Is Pangram
//leetcode link :https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

public class leetcode1832 {
    public boolean checkIfPangram(String sentence) {
        for(char c = 'a';c<= 'z';c++){
            if(sentence.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}
