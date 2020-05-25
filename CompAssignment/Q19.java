package CompAssignment;
import java.util.*;
class Q19
{
   public static void main()
   { String input;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a word");
      String s= sc.next();
      input= s.toLowerCase();
      String ans= "";
      for(int i=0;i< s.length(); i++)
      {
         char ch = s.charAt(i);
         if(ch =='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u')
         {
            ans= ans +(char) (ch+1);
        }
        else
        {
            ans= ans+ch;
        }
    }
    System.out.println(ans);
}
}

         
   

