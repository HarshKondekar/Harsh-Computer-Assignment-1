package Menu_Driven;
import java.util.Scanner;
class Prime_Automorphic
{
   int num;
   
   void generateMenu()
   { 
      Scanner sc = new Scanner(System.in);
      System.out.println("What would you like to check?");
      System.out.println("1. Prime Number");
      System.out.println("2. Automorphic Number");
      System.out.println("Press any integer other than [1/2] to exit");
    }
    
    void checkPrimeNumber()
    { 
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       num = sc.nextInt();
       int n = num;
       int count = -1;
      
       for(int i=2; i<=n; i++)
       {
          if(n%i==0)
          {
             count++;
            }
        }
        if(count ==0)
        {
           System.out.println("The number is Prime");
        }
        else
        {
           System.out.println("The number is not Prime");
        }
    }
    
    void checkAutomorphicNumber()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       num = sc.nextInt();
       int n = num;
       int count = 0;
       int s = num*num;
       
       while(n!=0)
       {
          count++;
          n = n/10;
        }
       
        int lastSquareDigit = (int) (s % (Math.pow(10, count)));
        
       if(num == lastSquareDigit)
       {
          System.out.println("The number is Automorphic");
        }
        else
        {
           System.out.println("The number is not Automorphic");
        }
    }
    
    public static void main()
    {
       Scanner sc = new Scanner(System.in);
       Prime_Automorphic obj = new Prime_Automorphic();
       char choice;
       int opt;
       
       do
       {
          obj.generateMenu();
          
          System.out.println("Enter your selection [1/2]");
          opt = sc.nextInt();
          if(opt == 1)
          obj.checkPrimeNumber();
          else if(opt == 2)
          obj.checkAutomorphicNumber();
          else
          return;
          
          System.out.println("Would you like to continue? [Y/N]");
          
          choice = (sc.next()).charAt(0);
        }
         while( choice == 'Y');
        
        }
    }
    