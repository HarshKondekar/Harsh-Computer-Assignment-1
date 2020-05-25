package CompProg;
class SI
{
   double principal, time, rate, SI;
   void init()
   {
      principal= 2000;
      time= 5;
      rate= 2.5;
    }
    void calc()
    {
       SI= (principal*rate*time)/100;
    }
    void display()
    {
       System.out.println("The Simple interest is" + SI);
    }
}


