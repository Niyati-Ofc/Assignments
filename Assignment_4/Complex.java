import java.util.Scanner;
class Comp
{
    double real;
    double img;

    void init() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextDouble();
        System.out.print("Enter imaginary part: ");
        img = sc.nextDouble();
    }

    void show() 
	{
        System.out.println(real + " + " + img + "i");
    }

    Comp add(Comp c) 
	{
        Comp temp = new Comp();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }
}

public class Complex 
{
    public static void main(String[] args) 
	{
        Comp c1 = new Comp();
        Comp c2 = new Comp();

        System.out.println("Enter first complex number:");
        c1.init();
        System.out.println("Enter second complex number:");
        c2.init();

        Comp sum = c1.add(c2);

        System.out.println("\nFirst Complex Number:");
        c1.show();
        System.out.println("Second Complex Number:");
        c2.show();
        System.out.println("Sum of Complex Numbers:");
        sum.show();
    }
}
