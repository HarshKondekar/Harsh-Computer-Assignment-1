package Pattern;
import java.util.Scanner;
class Pattern_6
{ 
   /* 
    A
    bb
    CCC
    dddd
    EEEEE
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
       char ch = 64;
       for(int i=1; i<=n; i++)
       {
          ch++;
          if(i%2 !=0)
          
             for(int j=1; j<=i; j++)
             
            System.out.print("" + ch);
            
            else
           
            for(int j=1; j<=i;j++)
            
            System.out.print("" + Character.toLowerCase(ch));
            
        
        System.out.println();
    }
}
            
          
    
    
    public static void main()
    {
       Pattern_6 obj = new Pattern_6();
       obj.getData();
       obj.generatePattern();
    }
}