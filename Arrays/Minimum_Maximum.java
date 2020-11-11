package Arrays;
import java.util.Scanner;
class Minimum_Maximum
{ 
   int[] Array;
   int max = 0;
   int min;
     Minimum_Maximum(int arrSize)
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
    
    void maximum()
    {
       for(int i = 0; i<=Array.length-1; i++)
       {
         if(max< Array[i])
         {
          max = Array[i];
        }
    }
    System.out.println("Largest number from array = " + max);
         
}


void minimum()
{
   for(int i=0; i<=Array.length-1; i++)
   {
      min = Array[0];
        
        
           if(min> Array[i])
           {
              min = Array[i];
            }
        }
    
        System.out.println("Smallest element from array = " + min);
    }

    public static void main()
    {
       Minimum_Maximum obj = new Minimum_Maximum(10);
       obj.initialize();
       obj.maximum();
       obj.minimum();
    }
}