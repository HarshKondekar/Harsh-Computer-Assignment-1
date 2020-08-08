package Loops;
import java.util.Scanner;
class Series_8  // (1+2)/(1X2) + (1+2+3)/(1X2X3) + ... (1+2+3+...+ n)/ (1X2X3 .. X n)
{
   int n;
   
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n");
      n = sc.nextInt();
    }
   int fact(int m)
   {
   int f = 1;
   for(int i=2; i<=m; i++)
   f = f *i;
   return f;
} 
int add(int p)
{
   int add = 1;
   for(int i=2; i<=p; i++)
   add = add + i;
   return add;
}

    
    void computeSum()
    {
       double sum = 0.0;
      
     for(int i=2; i<=n+1; i++)
    
       {
    
        
       sum = sum +  (double) add(i)/ fact(i);
    }
    System.out.println("The sum of the series = " + sum);
}
public static void main()
{
   Series_8 obj = new Series_8();
   obj.getData();
   obj.computeSum();
}
}