package CompAssignment;
import java.util.*;
class Average_marks
{
   public static void main()
   {
      Scanner sc= new Scanner(System.in);
      int n;
      System.out.println("Enter the number of students");
      n= sc.nextInt();
      int R[] = new int [n];
      String nm[] = new String [n];
      int n1[] = new int[n];
      int n2[] = new int[n];
      int n3[] = new int[n];
      for(int k=0; k<n; k++)
      {
         System.out.println("Enter Roll Number");
         R[k] = sc.nextInt();
         System.out.println("Enter marks in 3 subjects");
         n1[k] = sc.nextInt();
         n2[k] = sc.nextInt();
         n3[k] = sc.nextInt();
        }
        double average; String remarks;
        for(int k=0; k<n; k++)
        {
           average= (n1[k] + n2[k] + n3[k])/3.0;
           if(average<40)
           remarks= "POOR";
           else if(average>=40 && average<=59)
           remarks= "PASS";
           else if(average>=60 && average <= 74)
           remarks = "FIRST CLASS";
           else if(average >=75 && average<=84)
           remarks = "DISTINCTION";
           else
           remarks= "EXCELLENT";
           System.out.println(nm[k] + "\t" + average + "\t" + remarks);
        }
    }
}
           

