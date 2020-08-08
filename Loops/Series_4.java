package Loops;
import java.util.Scanner;
class Series_4 // S = x/1! + x^2/2! + x^3/3! + ... + x^n/n!
{
   int n;
   int x;
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the value of n");
      n = sc.nextInt();
    System.out.println("Enter the value of x");
    x = sc.nextInt();
}
 int fact(int m)
{
   int prod = 1;
   for(int i=1; i<=m; i++)
   prod = prod*i;
   return prod;
}
void computeSum()
{
   double sum = 0;
   
   for(int i=1; i<=n; i++)
   sum = sum + (Math.pow(x,1))/fact(i);
   
   System.out.println("The sum of series = " + sum);
}
public static void main()
{
   Series_4 obj = new Series_4();
   
   obj.getData();
   obj.computeSum();
}
}