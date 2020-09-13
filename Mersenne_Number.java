import java.util.*;
class Mersenne_Number
{
   void MersenneNos(int n)
   {
      int num = n + 1;
      
      int power = 0;
      int m = 0;
      
      for(int i=0; ; i++)
      {
         power = (int) Math.pow(2, i);
         if(power>num)
         {
            break;
        }
        else if(power == num)
        {
           System.out.println("It is Mersenne Number");
           m = 1;
        }
    }
    if(m == 0)
    {
       System.out.println("It is not Mersenne Number");
    }
}
}
            