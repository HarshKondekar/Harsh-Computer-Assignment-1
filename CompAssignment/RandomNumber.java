package CompAssignment;
import java.util.*;
class RandomNumber 
{
 
 public static void main() 
 {
  
  int minimum= 1;
  int maximum= 100;
  
  int randomNum = minimum + (int)(Math.random() * maximum);
  
  System.out.println("Random Number= "+randomNum);

 }

}
