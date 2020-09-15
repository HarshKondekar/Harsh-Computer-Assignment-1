package Pattern;
import java.util.Scanner;
class Pattern_5
{ 
   /* 
    1
    23
    345
    4567
    56789
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
       int c=0;
       for(int i= 1; i<=n; i++)
       { c=i;
          for(int j = 1; j<= i; j++)
          {
             System.out.print("" + (c++));
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
       Pattern_5 obj = new Pattern_5();
       obj.getData();
       obj.generatePattern();
    }
}