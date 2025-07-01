import java.util.Scanner;
// this is for string 
public class stringPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int i = 0,j = s.length() -1;
        boolean isPalindrome = true;
        while(i <j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("True, It is a Palindrome");
        }
        else{
            System.out.println("False, It is Not a Palindrome");
        }
    }   
}