package Loops;
import java.util.Scanner;
class sum_digit
{
   int num;
   void readNumber()
   {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number");
   num = sc.nextInt();
}
void digitSum()
{
   int n = num;
   int digit = -1;
   int sum= 0;
   while(n!=0)
   {
      digit = n%10;
      sum = sum+digit;
      n=n/10;
    }
    System.out.println("The sum of the digit = " + sum);
}
public static void main()
{
   sum_digit obj = new sum_digit();
   obj.readNumber();
   obj.digitSum();
}
}