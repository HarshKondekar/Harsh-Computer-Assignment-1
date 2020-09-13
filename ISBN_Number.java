
import java.util.Scanner;
class ISBN_Number
{ 
   long num;
   void readNumber()
   {  
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
       num= sc.nextLong();
    }
    
    void checkISBN()
    {
       long n = num;
       long d =0;
       int count = 0;
       long s =0;
       
       while(n!=0)
       {
          n = n/10;
          count++;
        }
        if(count ==10)
        {
           while(n!=0)
           {
              d = n%10;
              s = s+ (d*count);
              count--;
              n = n/10;
            }
           if(s%11 == 0)
           {
              System.out.println("Valid ISBN Number");
            }
        }
            else
            {
               System.out.println("Invalid ISBN Number");
            }
        }
    
    
    public static void main()
    {
       ISBN_Number obj = new ISBN_Number();
       obj.readNumber();
       obj.checkISBN();
    }
}