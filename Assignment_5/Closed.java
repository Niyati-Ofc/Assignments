abstract class Figure 
{
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) 
	{
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double getArea();
}

class Rectangle extends Figure 
{
    Rectangle(double length, double breadth) 
	{
        super(length, breadth);
    }

    double getArea() 
	{
        return dim1 * dim2;
    }
}

class Triangle extends Figure 
{
    Triangle(double base, double height) 
	{
        super(base, height);
    }

    double getArea() 
	{
        return 0.5 * dim1 * dim2;
    }
}

public class Closed
{
    public static void main(String[] args) 
{
        Figure f;

        f = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + f.getArea());

        f = new Triangle(10, 8);
        System.out.println("Area of Triangle: " + f.getArea());
    }
}
