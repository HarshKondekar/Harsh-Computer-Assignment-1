package Loops;
import java.util.Scanner;
class Armstrong_Number
{
    int num;
    void readNumber()
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the number");
      num  = sc.nextInt();
    }
    void checkArmStrong()
    {
       int n = num;
       int digit = -1;
       int sum= 0;
       
       while(n!=0)
       {
          digit = n%10;
          sum = sum + (digit*digit*digit);
          n = n/10;
        }
        if(sum==num)
        {
           System.out.println("The number is Armstrong");
        }
           else
           {
              System.out.println("The number is not Armstrong");
            }
        }
        public static void main()
        {
           Armstrong_Number obj = new Armstrong_Number();
           obj.readNumber();
           obj.checkArmStrong();
        }
    }
           