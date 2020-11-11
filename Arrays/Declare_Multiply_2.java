package Arrays;
import java.util.Scanner;
class Declare_Multiply_2
{
   int[] sArray;
   
   Declare_Multiply_2()
   {
      sArray = new int[10] ;
    }
    
    void initialize()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 10 numbers for the array");
       for(int i=0; i<=sArray.length-1; i++)
       {
          sArray[i] = sc.nextInt();
        }
        
    }
    
    void display()
    {
       for(int i=0; i<=sArray.length-1; i++)
       {
          System.out.println(sArray[i]*2);
        }
        
    }
    
    public static void main()
    {
       Declare_Multiply_2 obj = new Declare_Multiply_2();
       obj.initialize();
       obj.display();
    }
}