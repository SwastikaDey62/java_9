import java.util.*;
public class MathMethods
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = in.nextDouble();
        System.out.println("Natural logarithm = " + Math.log(n));
        System.out.println("Absolute value = " + Math.abs(n));
        System.out.println("Square root = " + Math.sqrt(n));
        System.out.println("Cube root= " + Math.cbrt(n));
        System.out.println("Random number = " + Math.random());
    }
}
