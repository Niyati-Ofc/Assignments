class Point2D 
{
    double x;
    double y;

    Point2D() 
	{
        x = 0;
        y = 0;
    }

    Point2D(double x, double y) 
	{
        this.x = x;
        this.y = y;
    }

    void display() 
	{
        System.out.println("2D Point Coordinates: (" + x + ", " + y + ")");
    }
}

class Point3D extends Point2D 
{
    double z;

    Point3D() 
	{
        super();
        z = 0;
    }

    Point3D(double x, double y, double z) 
	{
        super(x, y);
        this.z = z;
    }

    void show() 
	{
        System.out.println("3D Point Coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Point 
{
    public static void main(String[] args) 
	{
        Point2D p1 = new Point2D();
        p1.display();

        Point2D p2 = new Point2D(4.5, 7.2);
        p2.display();

        Point3D p3 = new Point3D();
        p3.show();

        Point3D p4 = new Point3D(3.1, 5.4, 9.8);
        p4.show();
    }
}
