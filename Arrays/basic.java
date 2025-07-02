package DSA.Arrays;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of numbers: ");
        int size = sc.nextInt();
        int numbers [] = new int[size];

        // taking input 
        for(int i = 0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        

        // taking output
        for(int i=0 ;i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("X found at index" + i);
            }
        }        


    }
}
