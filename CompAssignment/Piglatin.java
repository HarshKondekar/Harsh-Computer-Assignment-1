package CompAssignment;
import java.util.*;
class Piglatin
{
   public static void main()
   {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter any word");
 String s= sc.next();
 s= s.toUpperCase();
 int l = s.length();
 int p=0;
 char ch;
 for(int i=0; i<=1; i++)
 {
    ch= s.charAt(i);
    if(ch=='A' || ch=='E' || ch=='I' || ch== 'O' || ch== 'U')
    {
       p=i;
    }
}
String a= s.substring(p);
String b= s.substring(0, p);
String pig = a+b+ "AY" ;
System.out.println("Piglatin of the word is" + pig);
}
}

