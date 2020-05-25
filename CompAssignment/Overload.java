package CompAssignment;
import java.util.*;
class Overload

{
   void check(String str, char ch)
   {
      int c=0;
      for(int j=0; j<str.length(); j++)
      {
         char ch2= str.charAt(j);
         if(ch==ch2)
         c++;
        }
        if(c!=0)
        {
           System.out.println("Number of " + ch + "present is" + c);
        }
    }
    void check(String s1)
    {
       String s= s1.toLowerCase();
       System.out.println("Vowels are");
       for(int i=0;i<s.length(); i++)
       {
          char ch = s.charAt(i);
          if(ch=='a' || ch=='e' || ch== 'i'|| ch=='o' || ch=='u')
          System.out.print(ch + "");
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        String str, s2; char ch;
        System.out.println("Enter any word");
        str= sc.nextLine();
        System.out.println("Enter character from the word");
        ch= sc.next().charAt(0);
        
     
        Overload obj = new Overload();
        obj.check(str, ch);
        obj.check(str);
       
    }
}


