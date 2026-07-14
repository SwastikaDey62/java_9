import java.util.*;
public class NeonNumber
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();
        int p = n * n;
        int s = 0;
        while (p != 0) {
            int d = p % 10;
            s += d;
            p /= 10;
        }
        if (s == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
