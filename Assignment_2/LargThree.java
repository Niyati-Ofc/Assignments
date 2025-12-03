import java.util.Scanner;
public class LargThree
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); int a, b, c, largest; System.out.print("Enter first number: "); a = sc.nextInt();
System.out.print("Enter second number: "); b = sc.nextInt();
System.out.print("Enter third number: "); c = sc.nextInt();
largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); System.out.println("Largest number is: " + largest); sc.close();
}
}
