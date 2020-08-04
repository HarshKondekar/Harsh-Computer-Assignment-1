package If_Else;
class calculator_if_else
{
   int a;
   int b;
   double c;
   char ch;
   
    void init(int p, int q, char ch2)
   {
      a = p;
      b = q;
      ch = ch2;
    }
    void add()
    {
       c= a+b;
    }
    
     void sub()
     {
        c= a-b;
    }
    void multiply()
    {
       c = a*b;
    }
    
    void div()
    {
       c= a/b;
    }
    void calculate()
    {
       if(ch == '+')
       {
          add();
          System.out.println("Addition is " + c);
        }
        else if(ch == '-')
        {
           sub();
           System.out.println("Subtraction is " + c);
        }
        else if(ch == '*')
        {
           multiply();
           System.out.println("Product is " + c);
        }
        else if(ch == '/')
        {
           div();
        System.out.println("Division is " + c);
    }
    else
    {
       System.out.println("Invalid Character input");
    }
}
public static void main(int a, int b, char ch)
{
   calculator_if_else obj = new calculator_if_else();
   obj.init(a,b,ch);
   obj.calculate();
}
}
        