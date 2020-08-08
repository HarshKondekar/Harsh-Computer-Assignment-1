package Loops;
import java.util.Scanner;
class Series_6 // S = 1-2+3-4 + ... n terms
{
   int n;
    void getData()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of terms");
       n = sc.nextInt();
    }
void computeSum()
{ 
   int sum = 0;
   for(int i=1; i<=n; i++)
   {
      if(i%2 == 0)
      sum = sum-i;
      else
      sum = sum+i;
    }
    System.out.println("The sum of the series = "+ sum);
}
   
public static void main()
{
Series_6 obj = new Series_6();
obj.getData();
obj.computeSum();
}
}


   
       