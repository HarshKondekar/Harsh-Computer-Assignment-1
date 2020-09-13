package Menu_Driven;
import java.util.Scanner;
class Volume
{
   void generateMenu()
   {
      System.out.println("What would you like to do?");
      System.out.println("1. Calculate Volume of Sphere");
      System.out.println("2. Calculate Volume of Cylinder");
      System.out.println("3. Calculate Volume of Cone");
      System.out.println("Press any integer other than 1/2/3 to exit");
    }
    
    void calcSphereVolume()
    {
       Scanner sc = new Scanner(System.in);
       double volume;
       int radius;
       System.out.println("Enter radius of sphere");
       radius = sc.nextInt();
       volume = (4/3) * (3.14) * radius * radius * radius;
       System.out.println("Volume of sphere = " + volume);
    }
    void calcCylinderVolume()
    {
       Scanner sc = new Scanner(System.in);
       double volume;
       int radius;
       int height;
       
       System.out.println("Enter radius of cylinder");
       radius = sc.nextInt();
       System.out.println("Enter height of cylinder");
       height = sc.nextInt();
       
       volume = (3.14) * radius * radius* height;
       System.out.println("Volume of cone = " + volume);
    }
    void calcConeVolume()
    {
       Scanner sc = new Scanner(System.in);
       double volume;
       int radius;
       int height;
       
       System.out.println("Enter radius of Cone");
       radius = sc.nextInt();
       System.out.println("Enter height of cone");
       height = sc.nextInt();
       
       volume = (1/3) * (3.14) * radius * radius * height;
       
       System.out.println("Volume of Cone =" + volume);
    }
    
    public static void main()
    {
       Scanner sc = new Scanner(System.in);
       Volume obj = new Volume();
       char choice;
       int opt;
       do
       {
          obj.generateMenu();
          
          System.out.println("Enter your selection [1/2/3]");
          opt = sc.nextInt();
          if(opt == 1)
          obj.calcSphereVolume();
          else if(opt == 2)
          obj.calcCylinderVolume();
          else if(opt==3)
          obj.calcConeVolume();
          else
          return;
          
          System.out.println("Would you like to continue [Y/N]?");
          choice = (sc.next()).charAt(0);
        }
        while(choice == 'Y');
    }
}
    
    
    