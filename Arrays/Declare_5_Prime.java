package Arrays;
import java.util.Scanner;
class Declare_5_Prime
{ 
   int[] Array;
   
     Declare_5_Prime(int arrSize)
     {
        Array = new int[5];
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
   
    boolean isPrime(int n)
    {
       int count = 0;
       for(int j =1; j<=n; j++)
       {
          if(n%j == 0)
          count++;
        }
        
        if(count== 2)
        return true;
        else
        return false;
    }
    void checkPrime()
    { 
        int c = 0;
        System.out.println("All prime Numbers are ");
        for(int i= 0; i<= Array.length-1; i++)
        {  
           if(isPrime(Array[i]))
           {
              System.out.println(Array[i]);
              c++;
            }
        }
       if(c==0)
       System.out.println("There are no prime numbers in array");
    }

public static void main()
{
   Declare_5_Prime obj = new Declare_5_Prime(5);
   obj.initialize();
   obj.checkPrime();
  
}
}
   
