import java.util.Scanner;

class avg
{
    void calculateAverage(double num1, double num2, double num3) 
	{
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + avg);
    }
}

public class Average 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
        
        avg obj = new avg();
        obj.calculateAverage(a, b, c);
        
        sc.close();
    }
}
