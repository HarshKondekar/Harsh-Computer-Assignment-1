package Pattern;
import java.util.Scanner;
class Pattern_3
{ 
   /* 
    1
    23
    456
    78910
    */
   int n;
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows for pattern");
      n = sc.nextInt();
    }
    
    void generatePattern()
    {
       int count =0;
       for(int i=1; i<=n; i++)
       {
          for(int j=1; j<=i; j++)
          {
             count++;
             System.out.print(" " + count);
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
       Pattern_3 obj = new Pattern_3();
       obj.getData();
       obj.generatePattern();
    }
}
   