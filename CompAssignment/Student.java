package CompAssignment;

import java.util.*;
class Student
{
 
   public static void main( )
   {  
        String n; int r; double a; double b; double c; double d; double e;
       Scanner sc= new Scanner(System.in);
       {
           System.out.println("Write the name of student");
           n= sc.nextLine();
           System.out.println("Enter roll No.");
           r= sc.nextInt();
           System.out.println("Enter marks of 1st subject");
           a= sc.nextDouble();
           System.out.println("Enter marks of 2nd subject");
           b= sc.nextDouble();
           System.out.println("Enter marks of 3rd subject");
           c= sc.nextDouble();
           System.out.println("Enter marks of 4th subject");
           d= sc.nextDouble();
           System.out.println("Enter marks of 5th subject");
           e= sc.nextDouble();
        }
           
           
          
       System.out.println("Name of student is" + n);
       System.out.println("Roll No. is" + r);
      double  m= (a+b+c+d+e)/5;
      if(m>=90)
      System.out.println("Science with Computer");
      else if(m>=70 && m<=79)
      System.out.println("Commerce with Maths");
      else if(m>=60 && m<=69)
      System.out.println("Commerce without Maths");
    }
}


      
    



