import java.util.Scanner;
public class Quadratic
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); double a, b, c, d, x, y; System.out.print("Enter coefficient a: "); a = sc.nextDouble(); System.out.print("Enter coefficient b: "); b = sc.nextDouble(); System.out.print("Enter coefficient c: ");
c = sc.nextDouble();
d = (b * b) - (4 * a * c); if (d> 0)
{
x = (-b )+ Math.sqrt(d/ (2 * a));
y = (-b )- Math.sqrt(d/ (2 * a));
System.out.println("Roots are real and distinct: " + x + " and " + y);
}
else if (d == 0)
{
x = y = -b / (2 * a);
System.out.println("Roots are real and equal: " + x);
}
else
{
double ri = -b / (2 * a);
double im = Math.sqrt(-d) / (2 * a);
System.out.println("Roots are complex: " + ri + " + " + im+ "i and "
+ ri + " - " + im + "i");
}
sc.close();
}
}
