import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of name: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String hello = sb.toString();
        System.out.println(hello);
    }
}
