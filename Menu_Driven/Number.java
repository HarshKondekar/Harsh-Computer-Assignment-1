package Menu_Driven;
import java.util.Scanner;
class Number
{ 
   int num;
void generateMenu()
{

    Scanner sc = new Scanner(System.in);
    System.out.println("What would you like to check?");
    System.out.println("1. Palindrome Number");
    System.out.println("2. Perfect Number");
    System.out.println("Press any integer other than [1/2] to exit");
}
void checkPalindrome()
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   num = sc.nextInt();
   int n = num;
   int digit = 1;
   int rev = 0;
  
   while(n!=0)
 { 
    digit = n%10;
    rev = rev*10 + digit;
    n = n/10;
}
   
   if(rev == num)
 
   System.out.println("The number is Palindrome");
 else
 
 System.out.println("The number is not Palindrome");
 
}

void checkPerfect()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    num = sc.nextInt();
    int n = num;
    int sum = 0;
    for(int i=1; i<n;i++)
    {
       if(n%i == 0)
       {
          sum = sum+i;
        }
    }
    if(sum == n)
    {
       System.out.println("The number is Perfect");
       }
       else
       {
          System.out.println("The number is not Perfect");
        }
    }
    public static void main()
    {
       Scanner sc = new Scanner(System.in);
       
       Number obj = new Number();
       char choice;
       int opt;
       do
       {
          obj.generateMenu();
          System.out.println("Enter your selection [1/2]");
          opt = sc.nextInt();
          
          if(opt == 1)
          obj.checkPalindrome();
          
          else if(opt == 2)
          obj.checkPerfect();
          else
          return;
          System.out.println("Would you like to continue [Y/N]?");
          
          choice = (sc.next()).charAt(0);
        }
        while(choice == 'Y');
    }
}
   
   
  
