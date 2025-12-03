public class GCD
{
public static void main(String[] args)
{
if (args.length != 2)
{
System.out.println("Error: Please provide exactly two integer numbers as command- line arguments.");
return;
}
int a = Integer.parseInt(args[0]); int b = Integer.parseInt(args[1]); while (b != 0)
{
int temp = b; b = a % b;
a = temp;
}
System.out.println("GCD of " + args[0] + " and " + args[1] + " = " + a);
}
}
