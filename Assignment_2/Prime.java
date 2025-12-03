import java.util.Scanner;
public class Prime
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: "); int n = sc.nextInt();
int isPrime = 1; if (n <= 1)
{
isPrime = 0;
}
else
{
for (int i = 2; i <= n / 2; i++)
{
if (n % i == 0)
{
isPrime = 0; break;
}
}
}
if (isPrime)
System.out.println(n + " is a Prime number."); else
System.out.println(n + " is not a Prime number."); sc.close();
}
}
