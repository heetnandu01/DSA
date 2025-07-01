// count the numbers of a digit in a integer 

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        int count = 0;
        if(num == 0){
            count = 1;
        }
        else{
            while(num != 0){
                num = num / 10;
                count++;
            }
        }
        System.out.println(count);
    }
}

