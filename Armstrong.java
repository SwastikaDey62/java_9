import java.util.*;
public class Armstrong
{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int n = num;
        int s = 0;
        while (num > 0) {
            int d = num % 10;
            s = s + (d*d*d);
            num /= 10;
        }
        if (s == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
