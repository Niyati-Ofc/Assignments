abstract class Shape 
{
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape 
{
    void RectangleArea(double length, double breadth) 
	{
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void SquareArea(double side) 
	{
        System.out.println("Area of Square: " + (side * side));
    }

    void CircleArea(double radius) 
	{
        double area = 3.14159 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Ar 
{
    public static void main(String[] args) 
	{
        Area a = new Area();

        a.RectangleArea(10, 5);
        a.SquareArea(4);
        a.CircleArea(3);
    }
}
