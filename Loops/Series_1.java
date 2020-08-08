package Loops;
import java.util.Scanner;
class Series_1 // S = 1 + 2+ 3 + 4 + .... n terms
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
       sum = sum+i;
       System.out.println("The sum of series = " + sum);
    }
    public static void main()
    {
       Series_1 obj = new Series_1();
       obj.getData();
       obj.computeSum();
    }
    }