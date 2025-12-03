import java.util.Scanner; public class Largest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); int a, b, largest;
System.out.print("Enter first number: "); a = sc.nextInt();
System.out.print("Enter second number: "); b = sc.nextInt();
largest = (a > b) ? a : b; System.out.println("Largest number is: " + largest); sc.close();
}
}

