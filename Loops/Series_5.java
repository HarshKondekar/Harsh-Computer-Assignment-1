package Loops;
import java.util.Scanner;
class Series_5 // S = 1 + (1+2) + (1+2+3) + ... (1+2+3..+ n)
{
   int n;
   
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n");
      n = sc.nextInt();
    }
    int Sum(int m)
    {
       int a = 0;
       for(int i=1; i<=m; i++)
       
         a = a + i;
      return a;
  
    }
    
   void computeSum()
   {
      int sum =0;
      for(int i =1; i<=n; i++)
      sum = sum + Sum(i);
      System.out.println("Sum of series = " + sum);
    }
    public static void main()
    {
       Series_5 obj = new Series_5();
       obj.getData();
       obj.computeSum();
       
    }
}