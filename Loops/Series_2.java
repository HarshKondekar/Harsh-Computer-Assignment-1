package Loops;
import java.util.*;
class Series_2 // S = 1 + x + x^2 + x^3 + .... x^n.
{
   double n;
   double x;
    void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n");
      n = sc.nextDouble();
      System.out.println("Enter the value of x");
      x = sc.nextDouble();
    }
    void computeSum()
    {
       double  sum = 1.0;
       
       for(int i=1; i<=n; i++)
       sum = sum + Math.pow(x,i);
    
 System.out.println("The sum of series = " + sum);
}
public static void main()
{
   Series_2 obj = new Series_2();
   
   obj.getData();
   obj.computeSum();
}
}
