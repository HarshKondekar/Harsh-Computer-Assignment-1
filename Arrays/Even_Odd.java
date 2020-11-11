package Arrays;
import java.util.Scanner;
class Even_Odd
{ 
   int[] Array;
   
     Even_Odd(int arrSize)
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
   
    void even()
    { 
       System.out.println("Even elements are ");
       for(int i=0; i<=Array.length-1; i++)
       {
          
        
           if(Array[i] % 2 == 0)
           {
              System.out.println(Array[i]);
            }
        }
    }
    


void odd()
{
   System.out.println("Odd elements are ");
   for(int i=0; i<=Array.length-1; i++)
   {
     
        for( i=0; i<= Array.length-1; i++)
        {
           if(Array[i] % 2 != 0)
           {
              System.out.println(Array[i]);
            }
        }
    }
}

public static void main()
{
   Even_Odd obj = new Even_Odd(10);
   obj.initialize();
   obj.even();
   obj.odd();
}
}