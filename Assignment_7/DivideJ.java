import java.util.Scanner;

public class DivideJ 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int a, b, res;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        while (true) 
		{
            try 
			{
                System.out.print("Enter second number: ");
                b = sc.nextInt();
                res = a / b;
                System.out.println("Result = " + res);
                break;
            } 
			catch (ArithmeticException e) 
			{
                System.out.println("Error: Division by zero! Enter a non-zero number.\n");
            }
        }

        sc.close();
    }
}
