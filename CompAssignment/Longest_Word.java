package CompAssignment;
import java.util.*;
class Longest_Word
{
  public static void main()
  {
     String str, s, max;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Sentence");
     str= sc.nextLine() + " ";
     s = "";
     max= "";
     for(int i=0; i<str.length(); i++)
     {
        char c = str.charAt(i);
        if(c!= ' ')
        {
           s = s+c;
        }
        else
        {
           if(max.length()< s.length())
           {
              max = s;
            }
            s ="";
        }
    }
    System.out.println(max);
}
}
     