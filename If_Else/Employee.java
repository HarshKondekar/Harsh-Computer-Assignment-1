package If_Else;
class Employee
{
   int pan;
   String name;
   double taxincome;
   double tax;
   
   void input(int p, String n, double income)
   {
      pan = p;
      name = n;
      taxincome = income;
    }
    void calc()
    {
       if(taxincome<=100000)
       {
          tax = 0.0;
        }
        else if(taxincome<=150000)
        {
           tax = 1* (taxincome -100000);
        }
        else if(taxincome <=250000)
        {
           tax = 5000 + 2*(taxincome-150000);
        }
        else
        {
           tax = 25000 + 3*(taxincome -250000);
        }
    }
    void display()
    {
       System.out.println("Pan Number \t Name \t Tax- Income \t Tax");
       
       System.out.println(pan + "\t" + name + "\t" + taxincome + "\t" + tax);
    }
}
