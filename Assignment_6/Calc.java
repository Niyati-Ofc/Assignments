interface Calculator
{
    void add(double a, double b);
    void sub(double a, double b);
    void mul(double a, double b);
    void div(double a, double b);
}

class DemoCalculator implements Calculator 
{
    public void add(double a, double b) 
	{
        System.out.println("Addition: " + (a + b));
    }

    public void sub(double a, double b) 
	{
        System.out.println("Subtraction: " + (a - b));
    }

    public void mul(double a, double b) 
	{
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(double a, double b) 
	{
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division by zero not allowed!");
    }
}

public class Calc 
{
    public static void main(String[] args) 
	{
        Calculator c = new DemoCalculator();

        c.add(10, 5);
        c.sub(10, 5);
        c.mul(10, 5);
        c.div(10, 5);
    }
}
