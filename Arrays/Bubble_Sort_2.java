package Arrays;
import java.util.Scanner;
class Bubble_Sort_2
{
   int[] Array;
  
   Bubble_Sort_2(int arrSize)
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
    
    void arrange()
    {
       int temp;
       for(int i=0 ; i<= Array.length-2; i++)
       {
       for(int j=0; j<=Array.length-2; j++)
       if(Array[j] < 0 && Array[j+1] >= 0)
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
   Bubble_Sort_2 obj = new Bubble_Sort_2(9);
   obj.initialize();
   obj.arrange();
}
}
       
          