import java.util.Scanner;
class Mobike
{
   int bno;
   int phno;
   String name;
   int days;
   int charge;
   
   void input()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name of customer");
      name = sc.nextLine();
      System.out.println("Enter phone number");
      phno = sc.nextInt();
      System.out.println("Enter bike number");
      bno = sc.nextInt();
      System.out.println("Enter the number of days the bike is taken on rent");
      days = sc.nextInt();
    }
    
    void compute()
    {
       if(days<=5)
       charge = 500*days;
       else if(days<=10)
       charge = 500* 5 + (days-5) *400;
       else if(days>10)
       charge = 500*5 + 5*400 + (days-10)*200;
    }
    
    void display()
    { 
       System.out.println("Name of the customer is " + name);
       System.out.println("Bike Number is " +bno);
       System.out.println("Phone Number is " + phno);
       System.out.println("Number of days the bike was taken on rent is " + days);
       System.out.println("Charge to pay = " + charge);
    }
   public static void main()
   {
      Mobike obj = new Mobike();
      obj.input();
      obj.compute();
      obj.display();
}
}