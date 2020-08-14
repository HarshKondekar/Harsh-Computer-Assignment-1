package Loops;
import java.util.Scanner;
class product_digit
{
   int num;
   void readNumber()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      num = sc.nextInt();
    }
    void digitProduct()
    {
       int n = num;
       int digit = -1;
       int product = 1;
       
       while(n!=0)
      {
         digit = n%10;
         product = product *digit;
         n=n/10;
        }
        System.out.println("The product of the digit = " + product);
    }
    public static void main()
    {
       product_digit obj = new product_digit();
       obj.readNumber();
       obj.digitProduct();
    }
}
         