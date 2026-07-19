// Two numbers are said to be co-prime, if their HCF is 1
import java.util.*;
public class Coprime
{
    public static void main(String args []) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) 
        {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        if (hcf == 1)
            System.out.println(a + " and " + b + " are co-prime");
        else
            System.out.println(a + " and " + b + " are not co-prime");
    }
}
