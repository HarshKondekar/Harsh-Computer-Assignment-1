package Arrays;
import java.util.Scanner;
class Sale_Of_Week
{ 
   int[] Sale;
   int total;
   int average;
   Sale_Of_Week(int arrSize)
   {
      Sale = new int[arrSize];
    }
    
    void getData()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter sale of each day of the week");
      for(int i=0; i<=Sale.length-1; i++)
       {
          Sale[i] = sc.nextInt();
        }
    }
    
    void total()
    { 
       for(int i =0; i<=Sale.length-1; i++)
       {
       total+= Sale[i];
    }
    System.out.println("Total sale of the week is " + total);
}

void average()
{
   for(int i=0; i<=Sale.length-1; i++)
   {
      average = total/Sale.length;
    }
   
    System.out.println("Average sale of the week is " + average);
}
    
public static void main()
{
Sale_Of_Week obj = new Sale_Of_Week(7);
obj.getData();
obj.total();
obj.average();
}
}  