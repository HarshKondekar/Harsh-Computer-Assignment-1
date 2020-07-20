package Constructors;
class Temperature
{
   double temp;
   Temperature()
   {
      temp = 92;
    }
   Temperature(double t) // parameterised constructor
   {
      temp = t;
    }
    double convert2celcius()
    {
       double cel = (5.0/9) * (temp-32);
       return cel;
    }
    public double getTemp()
    {
       return temp;
    }
}
    class ImplementTemperature
    {
       public static void main ()
       {
          Temperature dayTemp = new Temperature(94);
          System.out.println("Temperature in farenheit is" + dayTemp.getTemp());
          System.out.println("Temperature in celcius is" + dayTemp.convert2celcius());
          Temperature dTemp = new Temperature();
          System.out.println("Other Temperature in Farenheit is" + dTemp.getTemp());
          System.out.println("Other Temperature in celcius is" + dTemp.convert2celcius());
        }
    }


      
   


