





package If_Else;
import java.util.Scanner;
class Weekly_Wages
{
   public static void main()
   {
      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter the number of hours worked");
      double H = sc.nextDouble(); // Number of hours worked
      System.out.println("Enter rate per hour");
      double R = sc.nextDouble(); // Rate per hour
      
      double W = 0; // Weekly Wages
      if(H>70)
      {
         System.out.println("Man is not allowed to work for more than 70 hours in a week");
        }
        else
      if( H <=35)
      {
         W = H * R ;
        }
        else if(H<=60)
        {
           W = (35 * R) + (H-35) * R * 1.5;
        }
        else
        {
           W = (35 * R) + 25 * (R * 1.5) + (H - 60) * (R * 2);
        }
        System.out.println("The weekly wages are" + W);
    }  
}

