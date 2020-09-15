package Pattern;
import java.util.Scanner;
class Pattern_1
{ 
   /* 
    1
    11
    111
    1111
    11111
    */
   int n;
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows for the pattern");
      n= sc.nextInt();
    }
    
    void generatePattern()
    {
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=i;j++)
          System.out.print("" + 1);
          System.out.println();
        }
    }
    
    public static void main()
    {
       Pattern_1 obj = new Pattern_1();
       obj.getData();
       obj.generatePattern();
    }
}