package Pattern;
import java.util.Scanner;
class Pattern_8
{ 
   /*
    1
    12
    123
    1234
    12345
    */
   int n;
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows for the pattern");
      n = sc.nextInt();
    }
    
    void generatePattern()
    {
       for(int i=1; i<=n; i++)
       {
          for(int j=1; j<=i;j++)
          System.out.print("" + j);
          
          System.out.println();
        }
    }
    
    public static void main()
    {
       Pattern_8 obj = new Pattern_8();
       obj.getData();
       obj.generatePattern();
    }
}
