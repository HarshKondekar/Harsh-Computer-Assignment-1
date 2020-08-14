package Loops;
import java.util.Scanner;
class average_digit
{
   int num;
   
   void readNumber()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      num = sc.nextInt();
    }
    
    void digitAverage()
    {
       int n= num;
       int digit = -1;
       int avg = 0;
       int sum = 0;
       int count = 0;
       
       while(n!=0)
       {
          digit = n%10;
          sum = sum + digit;
          count++;
          n=n/10;
        }
        avg = sum/count;
        
        System.out.println("The average of the digit = " + avg);
    }
    public static void main()
    {
       average_digit obj = new average_digit();
       obj.readNumber();
       obj.digitAverage();
    }
}
       
       