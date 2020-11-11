package Arrays;
import java.util.Scanner;
class Salary
{ 
   int N = 5;
   double[] Salary;
   String name[] = new String[N];
    int count;
   Salary(int arrSize)
   {
      Salary = new double[arrSize];
    }
    
    void getData()
    { 
       for(int i=0; i<=Salary.length-1; i++)
       {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name of Employee");
       name[i] = sc.nextLine();
       System.out.println("Enter Salary of the Employee");
       Salary[i] = sc.nextDouble();
    }
}

  void salaryAbove100000()
  { 
      for(int i = 0; i<=Salary.length-1; i++)
      {
    
     if(Salary[i] >100000)
     {
         count++;
        }
    }
        System.out.println("Number of Employee whose salary is more than 100000 is " + count);
        
    }
    
    public static void main()
    {
       Salary obj = new Salary(5);
       obj.getData();
       obj.salaryAbove100000();
    }
}