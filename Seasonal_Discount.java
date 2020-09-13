import java.util.Scanner;
class Seasonal_Discount
{ 
   String name;
   String add;
   double amt;
   double disc = 0.0;
   char ch;
  void input()
  { 
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name of the customer");
     name = sc.nextLine();
     System.out.println("Enter Address of the customer");
     add = sc.nextLine();
     System.out.println("Enter the amount of purchase");
     amt = sc.nextDouble();
     System.out.println("Enter the type of purchase Laptop or Desktop [L/D]");
     ch = sc.next().charAt(0);
    }
    
    void compute()
    {
       if(ch == 'L')
       {
          if(amt<=25000)
          {
             disc = 0.0;
            }
            else if((amt>25000) && (amt <=57000))
            {
               disc = 5.0/100 *amt;
            }
            else if((amt>57000) && (amt <=100000))
            {
               disc = 7.5/100*amt;
            }
            else
            {
               disc = 10.0/100*amt;
            }
        }
        else
        {
           if(amt<=25000)
           {
              disc = 5.0/100*amt;
            }
            else if((amt>25000) && (amt <=57000))
            {
               disc = 7.5/100 *amt;
            }
            else if((amt>57000) && (amt <=100000))
            {
               disc = 10.0/100*amt;
            }
            else
            {
               disc = 15.0/100*amt;
            }
        }
    }
    void display()
    { 
        double namt = amt -disc;
       System.out.println("Name of customer is " + name);
       System.out.println("Address of the customer is " + add);
       System.out.println("Net amount to be paid = " + namt);
    }
    public static void main()
    {
       Seasonal_Discount obj = new Seasonal_Discount();
       obj.input();
       obj.compute();
       obj.display();
    }
}