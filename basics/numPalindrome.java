// Number palindrome 

import java.util.Scanner;

public class numPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int rev  = 0;

        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num /10;
        }

        if(rev == originalNum){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
