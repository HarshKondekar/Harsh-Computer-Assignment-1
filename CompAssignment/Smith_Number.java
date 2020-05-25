package CompAssignment;
import java.util.*;
class Smith_Number
{
   public int sumDig(int n)
   {
      int s=0, rem;
      while(n!=0)
      {
         rem=n%10;
         s= s+rem;
         n=n/10;
        }
        return s;
    }
    public int sumPrimeFactor(int n)
    {
       int i=2, sum=0;
       while(n>1)
       {
          if(n%i==0)
          {
             sum= sum+sumDig(i);
             n=n/i;
            }
            else
            i++;
        }
        return sum;
    }
    public static void main()
    {
       int n, a, b;
       Scanner sc= new Scanner(System.in);
       Smith_Number obj= new Smith_Number();
       System.out.println("Enter a Number");
       n= sc.nextInt();
       a= obj.sumDig(n);
       b= obj.sumPrimeFactor(n);
       System.out.println("Sum of digit is" + a);
       System.out.println("Sum of prime factor" + b);
       if(a==b)
       System.out.println("It is Smith Number");
       else
       System.out.println("It is not SMith Number");
    }
}
