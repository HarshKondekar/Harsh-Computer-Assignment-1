package CompProg;
class Rectangle2
{
   double len, breadth1, ans; // interative variables
   void init(int length, int breadth) // formal paramters
   {
      len= length;
      breadth1= breadth;
    }
    double calc() // use of return
    {
       ans= len*breadth1;
       return ans;
    }
    public static void main()
    {
       Rectangle2 obj= new Rectangle2();
       obj.init(2,3);
       double result = obj.calc(); //caller
       System.out.println(result);
      
    }
}

   

