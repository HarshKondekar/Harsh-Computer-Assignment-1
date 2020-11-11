package Arrays;
import java.util.Scanner;
class Bubble_Sort
{
   int[] Array;
  
   Bubble_Sort(int arrSize)
   {
      Array = new int[arrSize];
    }
    
    void initialize()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 5 numbers for the array");
       for(int i=0; i<= Array.length-1; i++)
       {
          Array[i] = sc.nextInt();
        }
        
    }
    
    void display()
    {
      for(int i=0; i<= Array.length-1; i++)
      {
         System.out.println(Array[i]);
        }
    }
    
    void arrange()  //Ascending Order
    {
       int temp;
       for(int i=0; i<= Array.length-2; i++)
       {
          for(int j=0; j<=Array.length-2; j++)
          
             if(Array[j] > Array[j+1]) //change sign for Descending Order
             {
                temp = Array[j];
                Array[j] = Array[j+1];
                Array[j+1] = temp;
            }
            System.out.print("Pass/Iteration " + (i+1) + " --->");
            display();
        }
    }
    
    

public static void main()
{
   Bubble_Sort obj = new Bubble_Sort(5);
   obj.initialize();
   obj.display();
   obj.arrange();
}
}
    