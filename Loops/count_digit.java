package Loops;
import java.util.Scanner;
class count_digit
{
   int num;
   void readNumber()
   {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number");
   num = sc.nextInt();
}
void digitCount()
{
   int n = num;
   int digit= -1;
   int count = 0;
   while(n!=0)
   {
      digit=n%10;
      count++;
      n=n/10;
    }
    System.out.println("The count of the digit = " + count);
}
public static void main()
{
   count_digit obj = new count_digit();
   obj.readNumber();
   obj.digitCount();
}
}