import java.util.Scanner;
class ParkingLot
{
   int vno;
   int hours;
   double bill;
   
   void input()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Vehicle Number");
      vno = sc.nextInt();
      System.out.println("Enter the number of hours");
      hours = sc.nextInt();
    }
    
    void calculate()
    {
       if(hours<=1)
       {
          bill = hours*3;
        }
        else
        {
           bill = 3+ (hours-1) * 1.5;
        }
    }
    void display()
    {
       System.out.println("Vehicle Number is " + vno);
       System.out.println("Number of hours parked is " + hours);
       System.out.println("Parking charge is " + bill);
    }
    
    public static void main()
    {
       ParkingLot obj = new ParkingLot();
       obj.input();
       obj.calculate();
       obj.display();
    }
}