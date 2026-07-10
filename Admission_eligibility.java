import java.util.*;
public class Admission
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int p = in.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int c = in.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        int m = in.nextInt();
        int t = p + c + m;
        int pm = p + m;    
        if (p >= 60 && c >= 60 && m >= 50 
             && (t >= 170 || pm >= 110))
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}


