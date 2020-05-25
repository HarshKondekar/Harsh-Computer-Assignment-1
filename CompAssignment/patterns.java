package CompAssignment;
import java.util.*;
class patterns
{
    public static void main()
    {
       System.out.println("Enter 1 to print triangle of numbers");
       System.out.println("Enter 2 to print triangle of alphabets");
       Scanner obj= new Scanner(System.in);
      int n= obj.nextInt();
       switch(n)
       {
          case 1:
          System.out.println("Enter the no. of rows");
          int d= obj.nextInt();
          String s="";
          for(int i=1; i<=d;i++)
          {
             s=s+i+" ";
             System.out.println(s);
            }
            break;
            case 2:
             System.out.println("Enter the no. of rows");
             int e= obj.nextInt();
             for(int i=e;i>0;i--)
             {
                int alphabet= 65;
                for(int j=0; j<i; j++)
                {
                   System.out.print((char) (alphabet + j) + " " );
                }
               System.out.println();
            }
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}

             
   