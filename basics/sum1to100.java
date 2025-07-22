import java.util.Scanner;

public class sum1to100 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum  = 0;
        if(n == 0){
            sum = 0;
        }
        for(int i = 0 ;i<= n;i++){
            sum = sum + i;
        }
        System.out.println(sum);   
    }
}
