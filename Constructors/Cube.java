package Constructors;
class Cube
{
   int length;
   int breadth;
   int height;
   
   int getVolume()
   {
      return(length* breadth* height);
    }
   Cube(int l, int b, int h)
   {
      length = l;
      breadth = b;
      height = h;
    }
   Cube(int l, int b)
   {
      this(l, b, l);
    }
   Cube()
   {
      length = 5;
      breadth= 5;
      height= 5;
    }
}
class ImplementCube
{
   public static void main()
   {
      Cube obj1= new Cube();
      System.out.println("Volume of cube 1 is" + obj1.getVolume());
      Cube obj2 = new Cube (4, 5, 7);
      System.out.println("Volume of cube 2 is" + obj2.getVolume());
      Cube obj3 = new Cube(3, 5);
      System.out.println("Volume of cube 3 is" + obj3.getVolume());
    }
}
   

