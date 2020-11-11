package Arrays;
import java.util.Scanner;
class Reverse_Upper_Case
{
   String[] sArray; //declaration of array
   
   
   Reverse_Upper_Case(int arrSize)
   {
      sArray = new String[arrSize];
    }
    
    void initialize()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a sentence containing 4 words ");
       
       for(int i=0; i<=sArray.length-1; i++)
       {
          sArray[i] = sc.next();
        }
    }
    
    void display() //displaying the contents of the array in reverse order afting converting into UpperCase.
    {
       for(int i= sArray.length-1; i>=0; i--)
       {
          System.out.print(" " + sArray[i].toUpperCase() + " ");
        }
        
    }
    
    public static void main()
    {
       Reverse_Upper_Case obj = new Reverse_Upper_Case(4);
       obj.initialize();
       obj.display();
    }
}