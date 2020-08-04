package If_Else;
import java.util.*;
class Shopping
{
   
   public static void main()
   {
      float PurchaseAmount, Discount=0, AdditionalDiscount=0, NetAmount=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("BigLife Garment Store");
      System.out.println("Enter purchase amount");
      if(sc.hasNextFloat())
      {
         PurchaseAmount = sc.nextFloat();
         if(PurchaseAmount<=5000)
         Discount =400;
         else if((PurchaseAmount>5000) &&(PurchaseAmount<=10000))
         Discount =800;
         else if((PurchaseAmount>10000) && (PurchaseAmount<= 20000))
         Discount =1000;
         else if(PurchaseAmount>20000)
         Discount =2000;
         
         NetAmount = PurchaseAmount- Discount;
           System.out.println("Purchase Amount is " + PurchaseAmount);
           if(PurchaseAmount >20000)
           {
              AdditionalDiscount = NetAmount*3/100;
                System.out.println("Additional discount on " + NetAmount + "is " + AdditionalDiscount);
                NetAmount = NetAmount- AdditionalDiscount;
            }
             System.out.println("Net Amount is " + NetAmount);
            }
            else
            System.out.println("Non-integer value entered");
            }
        }
    