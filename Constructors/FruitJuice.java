package Constructors;
import java.util.Scanner;
class FruitJuice
{
   int product_code;
   String flavour;
   String pack_type;
   int pack_size;
   int product_price;
   
   public FruitJuice()
   {
       product_code = 0;
       flavour = "";
       pack_type = "";
       pack_size = 0;
       product_price= 0;
    }
   void input()
   {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter Product Code");
      product_code = sc.nextInt();
      System.out.println("Enter Flavour");
      flavour= sc.next();
      System.out.println("Enter pack type");
      pack_type = sc.next();
      System.out.println("Enter pack size");
      pack_size = sc.nextInt();
      System.out.println("Enter product price");
      product_price = sc.nextInt();
    }
    void discount()
    {
       product_price = (int) (0.9*product_price);
    }
    void display()
    {
       System.out.println("Product code is" + product_code);
       System.out.println("Flavour is" + flavour);
       System.out.println("Pack type is" + pack_type);
       System.out.println("Pack size is" + pack_size);
       System.out.println("Product price is" + product_price);
    }
}

       
      

