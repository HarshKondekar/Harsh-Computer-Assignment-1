package Arrays;
import java.util.Scanner;
class Directory
{ 
   
   
   String[] nameArray = {"Harsh","Shyam,", "Navneet", "Ramesh", "Soham",};
   String[] telArray= {"0987940001", "0987940002", "09897940003", "09897900004", "0987940005"};
  
   
    
    void search(String sname) //Linear Search
    { 
        
       int pos = -1;
       for(int i=0; i<=nameArray.length-1; i++)
       
        if(nameArray[i].equals(sname))
        {
           pos =i;
        }
        if(pos ==-1)
        {
           System.out.println("Search unsuccessful. Name not elisted");
        }
        else
        {
           System.out.println("Search Successful, Name: " + nameArray[pos] + " Telephone Number: " + telArray[pos]);
        }
    
}
    public static void main()
    {
       Directory obj = new Directory();
      
       Scanner sc = new Scanner(System.in);
       String name;
       System.out.println("Enter the name ");
       name = sc.next();
       obj.search(name);
    }
}