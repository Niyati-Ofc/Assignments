public class GCD
{
int gcd(int a, int b)
{
if (b == 0) return a;
else
return gcd(b, a % b);
}


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); GCD obj = new GCD(); System.out.print("Enter first number: "); int x = sc.nextInt(); System.out.print("Enter second number: "); int y = sc.nextInt();
int result = obj.gcd(x, y); System.out.println("GCD = " + result); sc.close();
}
}