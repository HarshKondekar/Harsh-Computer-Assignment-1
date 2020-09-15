package Pattern;
import java.util.Scanner;
class Pattern_2
{ 
   /* 
    1
    22
    333
    4444
    55555
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
          System.out.print("" + i);
          
          System.out.println();
        }
    }
    
    public static void main()
    {
       Pattern_2 obj = new Pattern_2();
       obj.getData();
       obj.generatePattern();
    }
}