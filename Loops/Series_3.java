package Loops;
import java.util.*;
class Series_3 // S= 2 + 5 + 10 + 17 + 26+ ... n terms
{
int n;

   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of terms in the series");
      n = sc.nextInt();
    }
    void computeSum()
    {
       int sum = 0;
       
       for(int i=1;i<=n;i++)
       sum = sum + (i*i) +1;
       System.out.println("The sum of series = " + sum);
    }
    public static void main()
    {
       Series_3 obj = new Series_3();
       obj.getData();
       obj.computeSum();
    }
    }