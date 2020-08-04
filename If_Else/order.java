package If_Else;
class order
{
   int x, y, z;
   public order(int n1, int n2, int n3)
   {
      x = n1;
      y= n2;
      z = n3;
    }
    void sort()
    {
      if(x<y)
      {
         if(z<x)
         System.out.println(z +" " + x + " "+ y);
      else if(z>y)
         System.out.println(x +" " + y + " " + z);
         else
        System.out.println(x + "" + z + " "+ y);
    }
  else
  {
     if(z<y)
     System.out.println(z + " " + y + " " + x);
     else if(z>x)
     System.out.println(y + " " + x + " " + z);
     else
     System.out.println(y + " " + z + " " + x);
     
    }
    }
}

     