import java.util.Scanner;

public class Divide
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int x, y;
        double res;

        System.out.print("Enter value of x: ");
        x = sc.nextInt();

        System.out.print("Enter value of y: ");
        y = sc.nextInt();

        try 
		{
            int diff = x - y;
            if (diff == 0)
                throw new ArithmeticException("Denominator (x - y) became zero.");
            res = (double) x / diff;
            System.out.println("Result = " + res);
        } 
		catch (ArithmeticException e) 
		{
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please ensure that x and y are not equal.");
        }

        sc.close();
    }
}
