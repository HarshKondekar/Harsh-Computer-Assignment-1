package Board_2020;
import java.util.Scanner;
class CabService
{ 
   String car_type;
   double km;
   double bill;
   
   void CabService()
    {
       car_type = "";
       km = 0.0;
       bill = 0.0;
    }
    
    void accept()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Car type- AC or NON AC");
       car_type = sc.next();
       System.out.println("Enter kilometer travelled");
       km = sc.nextDouble();
    }
    
    void calculate()
    { 
       if(km<=5)
       {
       if(car_type.equalsIgnoreCase("AC"))
       
       bill = 150;
       else
       
       bill = 120;
    }
    else
    {
       if(car_type.equalsIgnoreCase("NON AC"))
       bill = 120 + (10*km);
       else
       bill = 150 + (8*km);
    }
}
void display()
{
   System.out.println("CAR TYPE: " + car_type);
   System.out.println("KILOMETER TRAVELLED:"+ km);
   System.out.println("TOTAL BILL: " + bill);
}

public static void main()
{
   CabService obj = new CabService();
   obj.accept();
   obj.calculate();
   obj.display();
}
}