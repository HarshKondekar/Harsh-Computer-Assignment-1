import java.util.Scanner;
class Primorial_Number
{ 
   int num;
    void readNumber()
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     num = sc.nextInt();
    }
    
    void findPrimorial()
    {
    
       int p = 1;
       int n = num;
       
       for(int i =n; i>1;i--)
       { 
             int count = 0;
          for(int j=1; j<=i;j++)
          {
             if(i%j == 0)
             {
                count++;
            }
        }
            if(count ==2)
            {
               p = p*i;
            }
        }
    
    
    System.out.println(p);
}

public static void main()
{
   Primorial_Number obj = new Primorial_Number();
   obj.readNumber();
   obj.findPrimorial();
}
}
    
     