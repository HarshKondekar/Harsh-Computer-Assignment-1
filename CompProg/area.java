package CompProg;
class area
{
   void area(float x)
   {
      System.out.println("Area of square is" + Math.pow(x,2) + "sq. units");
    }
    void area(float x, float y)
    {
       System.out.println("Area of rectangle is" + x*y + "sq. units");
    }
    void area(double x)
    {
       double z= 3.14 * x*x;
       System.out.println("Area of circle is" + z + "sq.units");
    }

   public static void main()
   {
      area obj= new area();
      obj.area(5);
      obj.area(11,12);
      obj.area(2.5);
    }
}




