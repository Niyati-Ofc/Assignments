import java.util.Scanner;
class Compl 
{
    double real;
    double img;

    Compl(double real, double img) 
	{
        this.real = real;
        this.img = img;
    }

    void displayCompNumber() 
	{
        System.out.println(real + " + " + img + "i");
    }

    Compl addCompNumber(Compl c) 
	{
        return new Compl(this.real + c.real, this.img + c.img);
    }
}

public class Complex_ad 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number:");
        System.out.print("Real part: ");
        double r1 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i1 = sc.nextDouble();
        System.out.println("\nEnter second complex number:");
        System.out.print("Real part: ");
        double r2 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i2 = sc.nextDouble();
        Compl c1 = new Compl(r1, i1);
        Compl c2 = new Compl(r2, i2);
        System.out.print("\nFirst Complex Number: ");
        c1.displayCompNumber();
        System.out.print("Second Complex Number: ");
        c2.displayCompNumber();
        Compl sum = c1.addCompNumber(c2);
        System.out.print("Sum of Complex Numbers: ");
        sum.displayCompNumber();
        sc.close();
    }
}
