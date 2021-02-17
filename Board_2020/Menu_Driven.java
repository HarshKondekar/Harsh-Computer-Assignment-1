package Board_2020;
import java.util.Scanner;
class Menu_Driven
   {
   double a;
   double b= 3.0;
   double c;
   void generateMenu()
   { 
      Scanner sc = new Scanner(System.in);
      System.out.println("What would you like to do?");
      System.out.println("1. Print value of c = a^2 + 2ab");
      System.out.println("2. Display the Pattern");
      System.out.println("Press any integer other than [1/2] to exit");
    }
    
    void Print() //Method to print value of c
    {
       Scanner sc = new Scanner(System.in);
       for(double a =1.0; a<=20.0; a++)
       {
       
       c = (a*a ) + (2*a*b);
       System.out.println("Value of c = " + c);
    }
}
    void Pattern() //Method to print the pattern
    { 
       for(int i=1; i<=5; i++)
       {
          int a = 65; //ASCII of A = 65
          for(int j=1; j<=i; j++)
        {
           System.out.print((char)a);
           a++;
        }
        System.out.println();
    }
}
     public static void main() //Main method
    {
       Scanner sc = new Scanner(System.in);
       Menu_Driven obj = new Menu_Driven(); 
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
         obj.Print();
         break;
         case 2:
         obj.Pattern();
         break;
         default:
         System.out.println("Invalid Input"); 
         return;
        }
          
          
          System.out.println("Would you like to continue? [Y/N]");
          
          choice = (sc.next()).charAt(0);
        }
        while( choice == 'Y');
        
        }
    }

