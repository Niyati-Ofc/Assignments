import java.util.Scanner;
class Area 
{
    double len;
    double wid;

    void setDim(double len, double wid) 
	{
        this.len= len;
        this.wid = wid;
    }

    double getArea() 
	{
        return this.len * this.wid;
    }
}

public class Rectangle 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double w = sc.nextDouble();
        Area rect = new Area();
        rect.setDim(l, w);
        System.out.println("Area of the rectangle: " + rect.getArea());
        sc.close();
    }
}

