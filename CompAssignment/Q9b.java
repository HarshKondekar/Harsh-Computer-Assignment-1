package CompAssignment;
import java.util.Scanner;

 class Q9b
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of x : ");
        
        double x = sc.nextDouble();        
        double sumOfSeries = 0;
        double numerator = x;
        double denominator;
        double term;

        for(int i = 2; i <= 20; i = i + 3) 
        {
            
            denominator = i;
            term = numerator / denominator;
            sumOfSeries = sumOfSeries + term;
            
        }
        
        System.out.println("Sum of the series : " + sumOfSeries);
        
    }
}



