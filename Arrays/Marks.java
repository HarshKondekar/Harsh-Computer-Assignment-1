package Arrays;
import java.util.Scanner;
class Marks
{ 
    int[] Marks;
   String name;
   int total;
   int average;
   Marks(int arrSize)
   {
      Marks = new int[arrSize];
    }
    
    
    void getData()
   { 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name of the student");
      name = sc.nextLine();
      System.out.println("Enter marks obtain in 5 Subjects");
      for(int i=0; i<=Marks.length-1; i++)
       {
          Marks[i] = sc.nextInt();
        }
    }
    
    void totalmarks()
    { 
       for(int i =0; i<=Marks.length-1; i++)
       {
       total+= Marks[i];
    }
    System.out.println("Total marks obtained by " + name + " is " + total);
}

void average()
{
   for(int i=0; i<=Marks.length-1; i++)
   {
      average = total/Marks.length;
    }
   
    System.out.println("Average marks of " + name + " is " + average);
}

public static void main()
{
   Marks obj = new Marks(5);
   obj.getData();
   obj.totalmarks();
   obj.average();
}
}
       