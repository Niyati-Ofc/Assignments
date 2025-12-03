import java.util.Scanner; public class Sum
{
int Sum(int n)
{
if (n == 1) return 1;
else
return n + sum(n - 1);
}


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); Sum obj = new Sum(); System.out.print("Enter n: ");
int n = sc.nextInt(); System.out.println("Sum = " + obj.Sum(n)); sc.close();
}
}
