package Menu_Driven;
import java.util.Scanner;
class Fibonacci_Sum_Digits
{ 
   int num;
   void generateMenu()
    { 
      Scanner sc = new Scanner(System.in);
      System.out.println("What would you like to do?");
      System.out.println("1. Display first 10 terms of Fibonacci series");
      System.out.println("2. Find the sum of digits of an integer");
      System.out.println("Press any integer other than [1/2] to exit");
    }
    
    void displayFibonacci()
    {
       int a = 0;
       int b = 1;
       System.out.println(a);
       System.out.println(b);
       int c;
       
       for(int i=1; i<=8;i++)
       {
          c = a+b;
          System.out.println(c );
          a = b;
          b = c;
        }
    }
    
    void findSumDigit()
     { 
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
          num = sc.nextInt();
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
   Scanner sc = new Scanner(System.in);
   Fibonacci_Sum_Digits obj = new Fibonacci_Sum_Digits();
   char choice;
   int opt;
   
   do
   {
      obj.generateMenu();
      System.out.println("Enter your selection [1/2]");
   opt = sc.nextInt();
   switch(opt)
   {
   case 1:
   obj.displayFibonacci();
   break;
   case 2:
   obj.findSumDigit();
   break;
   default:
   System.out.println("Invalid choice");
   return;
}
    System.out.println("Would you like to continue? [Y/N]");
   
   choice = (sc.next()).charAt(0);
}
   while(choice == 'Y');
}
}
   
          
       