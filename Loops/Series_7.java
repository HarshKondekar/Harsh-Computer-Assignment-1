package Loops;
import java.util.Scanner;
class Series_7 // S = 2! - 4! + 6! - 8! + .... n terms
{
   int n;
   int i= 2;
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of terms");
      n = sc.nextInt();
    }
    int fact(int m)
{
   int f = 1;
   for(int i=1; i<=m; i++)
   f = f *i;
   return f;
} 
void computeSum()
{
   int sum = 0;
   for(int c =1; c<=n; i+=2, c++)
   {
      if(i%4==0)
      sum = sum - fact(i);
         else
         sum = sum + fact(i);
        }
        System.out.println("The sum of the series = " + sum);
    }

public static void main()
{ 
  Series_7 obj = new Series_7();
obj.getData();
obj.computeSum();
}
}  