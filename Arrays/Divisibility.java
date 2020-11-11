package Arrays;
import java.util.Scanner;
class Divisibility
{
  
   int X;
   int[] Array;
   
    Divisibility(int arrSize)
     {
        Array = new int[10];
    }
    
    void initialize()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 10 numbers for the array");
       for(int i=0; i<= Array.length-1; i++)
       {
          Array[i] = sc.nextInt();
        }
        
    }
    
    void Divisible()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number for checking divisibility");
       X = sc.nextInt();
       
       System.out.println("Numbers which are divisible by " + X + " are");
       for(int i=0; i<=Array.length-1; i++)
       {
          if((Array[i] % X) == 0)
          {
             
              System.out.println(Array[i]);
            }
           
        }
    }

    
    void notDivisible()
    {
     
       System.out.println("Number which are not divisible by " + X + " are");
       for(int i=0; i<=Array.length-1; i++)
       {
          if((Array[i] % X)!= 0)
          {
             
               System.out.println(Array[i]);
            }
        }
    }
public static void main()
{ 
  Divisibility obj = new Divisibility(10);
  obj.initialize();
  obj.Divisible();
  obj.notDivisible();
}
}