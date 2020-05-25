package CompAssignment;
import java.util.*;
public class Longest_Word
{
  public static void main() 
  {
Scanner sc = new Scanner(System.in);
String s1= sc.nextLine();
System.out.println(lengthiestString(s1));
}
public static String lengthiestString(String s1) {
int max=0;
String s2=new String();
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s3=t.nextToken();
int n=s3.length();
if(n>max){
max=n;
s2=s3;}
}
return s2;
}
}


