import java.util.Scanner;
class Bx 
{
    double w;
    double h;
    double d;

    Bx(double w, double h, double d) 
	{
        this.w = w;
        this.h = h;
        this.d = d;
    }

    double volume() 
	{
        return this.w * this.h * this.d;
    }
}

public class Box 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of the box: ");
        double w = sc.nextDouble();
        System.out.print("Enter height of the box: ");
        double h = sc.nextDouble();
        System.out.print("Enter depth of the box: ");
        double d = sc.nextDouble();
        Bx b = new Bx(w, h, d);
        System.out.println("Volume of the box: " + b.volume());
        sc.close();
    }
}
