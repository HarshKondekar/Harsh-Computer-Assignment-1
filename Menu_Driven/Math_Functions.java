package Menu_Driven;
import java.util.Scanner;
class Math_Functions
{
   double num;
   void generateMenu()
   {
      System.out.println("What would you like to do?");
      System.out.println("1. Calculate Natural logarithm of the number");
      System.out.println("2. Calculate Absolute value of the number");
      System.out.println("3. Calculate Square root of the number");
      System.out.println("4. Find random numbers between 0 and 1");
      System.out.println("Press any integer other than [1/2/3/4] to exit");
    }
    
    void calculateLogarithm()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       num = sc.nextDouble();
       double n = num;
       
       System.out.println("The Natural logarithm of the number is " + Math.log(n));
    }
    
    void calculateAbsolute()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       num = sc.nextDouble();
       double n = num;
       Math.abs(n);
       System.out.println("The absolute value of the number is " + n);
    }
    
    void calculateSquareRoot()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       num = sc.nextDouble();
       double n = num;
       Math.sqrt(n);
     System.out.println("The square root of the number is " + n);
    }
    
    void calculateRandomNumber()
    {
      System.out.println("Random Number between 0 and 1 is " + Math.random());
    }
    
    public static void main()
    {
       Scanner sc = new Scanner(System.in);
 
       Math_Functions obj = new Math_Functions();
       char choice;
       int opt;
       do
       {
          obj.generateMenu();
          
          System.out.println("Enter your selection [1/2/3/4]");
          opt = sc.nextInt();
          if(opt == 1)
          obj.calculateLogarithm();
          else if(opt == 2)
          obj.calculateAbsolute();
          else if(opt == 3)
          obj.calculateSquareRoot();
          else if(opt == 4)
          obj.calculateRandomNumber();
          else
          return;
          
          System.out.println("Would you like to continue? [Y/N]");
          choice = (sc.next()).charAt(0);
        }
        while(choice == 'Y');
    }
}
          