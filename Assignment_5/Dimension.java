class Figure 
{
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) 
	{
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() 
	{
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure 
{
    Rectangle(double length, double breadth) 
	{
        super(length, breadth);
    }

    double area() 
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

    double area() 
	{
        return 0.5 * dim1 * dim2;
    }
}

class Square extends Figure 
{
    Square(double side) 
	{
        super(side, side);
    }

    double area() 
	{
        return dim1 * dim2;
    }
}

public class Dimension
{
    public static void main(String[] args) 
	{
        Figure f;

        f = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + f.area());

        f = new Triangle(10, 8);
        System.out.println("Area of Triangle: " + f.area());

        f = new Square(6);
        System.out.println("Area of Square: " + f.area());
    }
}
