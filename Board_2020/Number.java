package Board_2020;
import java.util.Scanner;
class Number
{
   void Number(int num, int d)
   {
      int count = 0; //Store frequency 
      while(num!=0)
      {
         if(num%10 == d)
         count++;
         num = num/10;
        }
        System.out.println("Freuqnecy of " + d + " is:" + count);
    }
    
    void Number(int n1)
    {
       int s=0; //Storing sum
       int d;
       
       while(n1!=0)
       {
          d = n1%10;
          if(d%2 == 0)
          s= s+d; //Store sum of even digits
        n1 = n1/10;
    }
    System.out.println("Sum of Even digits is "+ s);
}

public static void main() //Main method
{ 
   Scanner sc = new Scanner(System.in);
   
   Number obj = new Number(); //object creation
   System.out.println("Enter number and digit");
   int num = sc.nextInt();
   int d = sc.nextInt();
   
   
   System.out.println("Enter the number");
   int n1 = sc.nextInt();
   obj.Number(num, d);
   obj.Number(n1);
   
}
}
   


        