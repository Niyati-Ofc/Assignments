import java.util.Scanner; public class Palindrome
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); int num, n, rev = 0, digit; System.out.print("Enter a number: ");
num = sc.nextInt(); n = num;
while (num > 0)
{
digit = num % 10; rev = rev * 10 + digit; num = num / 10;
}
if (n == rev)
{
System.out.println(n + " is a Palindrome.");
}
else
{
System.out.println(n + " is not a Palindrome.");
}
sc.close();
}
}
