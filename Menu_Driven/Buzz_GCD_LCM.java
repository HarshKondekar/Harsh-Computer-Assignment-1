package Menu_Driven;
import java.util.Scanner;
class Buzz_GCD_LCM
{ 
   int num;
   int a;
   int b;
   int GCD;
  void generateMenu()
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("What would you like to do?");
     System.out.println("1. Check Buzz Number");
     System.out.println("2. Calculate GCD and LCM");
     System.out.println("Press any integer other than [1/2] to exit");
    }
    
    void checkBuzzNumber()
    { 
       int n = num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      n = sc.nextInt();
      
      
         if((n % 7 == 0) || (n% 10 == 7))
          {
             System.out.println("It is buzz number");
            }
            else
            {
               System.out.println("It is not buzz number");
            }
        }
        
        void calculateGCDLCM()
        { 
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter first number");
           a = sc.nextInt();
           System.out.println("Enter second number");
           b = sc.nextInt();
           int LCM;
           for(int i= 1; i<=a && i<=b; ++i)
           {
              if((a%i == 0) && (b%i == 0))
              {
                GCD = i;
            }
       
    }
    LCM = a*b/GCD;
     System.out.println("GCD of the numbers is " + GCD);
     System.out.println("LCM of the numbers is " + LCM);
    }
    public static void main()
    { 
        Scanner sc = new Scanner(System.in);
       Buzz_GCD_LCM obj = new Buzz_GCD_LCM();
       char choice;
       int opt;
       
       do
       {
          obj.generateMenu();
          
          System.out.println("Enter your selection [1/2]");
          opt = sc.nextInt();
          if(opt == 1)
          obj.checkBuzzNumber();
          else if(opt == 2)
          obj.calculateGCDLCM();
          else
          return;
          
          System.out.println("Would you like to continue [Y/N]?");
          
          choice = (sc.next()).charAt(0);
        }
        while(choice == 'Y');
    }
}
       
