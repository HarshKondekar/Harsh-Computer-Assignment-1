package Loops;
import java.util.Scanner;
class sum_square_digits
{
   int num;
   
   void readNumber()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      num = sc.nextInt();
    }
    void digitSquareSum()
    {
       int n= num;
       int digit = -1;
       int sum = 0;
       
       while(n!=0)
       {
       digit = n%10;
       sum = sum + digit*digit;
       n= n/10;
    }
    System.out.println("The sum of squares of digits = " + sum);
}
public static void main()
{
   sum_square_digits obj = new sum_square_digits();
   
   obj.readNumber();
   obj.digitSquareSum();
}
}