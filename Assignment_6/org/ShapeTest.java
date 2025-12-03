package org;

import java.util.Scanner;
import org.shapes.Square;
import org.shapes.Circle;
import org.shapes.Triangle;

public class ShapeTest 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) 
		{
            case 1:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                Square sq = new Square(side);
                System.out.println("Area of Square: " + sq.area());
                System.out.println("Perimeter of Square: " + sq.perimeter());
                break;

            case 2:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                Circle cr = new Circle(radius);
                System.out.println("Area of Circle: " + cr.area());
                System.out.println("Perimeter of Circle: " + cr.perimeter());
                break;

            case 3:
                System.out.print("Enter three sides: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                Triangle tr = new Triangle(a, b, c);
                System.out.println("Area of Triangle: " + tr.area());
                System.out.println("Perimeter of Triangle: " + tr.perimeter());
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
