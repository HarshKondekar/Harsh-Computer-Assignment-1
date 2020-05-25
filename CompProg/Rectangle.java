package CompProg;
class Rectangle
{
   int length, breadth, ans;
   void init()
   {
      length=10;
      breadth = 20;
    }
    void calc()
    {
       ans= length*breadth;
    }
    void display()
    {
       System.out.println("The result is"+ ans);
    }
}


