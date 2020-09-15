package Pattern;
import java.util.Scanner;
class Pattern_4
{ 
   /* 
    5
    54
    543
    5432
    54321
    */
   int n;
   
   void getData()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of rows for the pattern");
      n = sc.nextInt();
    }
    
    void generatePattern()
    {
       for(int i= n; i>=1; i--)
       {
          for(int j = n; j>=i; j--)
          {
             System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
       Pattern_4 obj = new Pattern_4();
       obj.getData();
       obj.generatePattern();
    }
}