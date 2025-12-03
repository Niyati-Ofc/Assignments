import java.util.Scanner; public class Binary
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); int num;
String binary = "";
System.out.print("Enter a decimal number: "); num = sc.nextInt();
int n = num; if (num == 0)
{
binary = "0";
}
else
{
while (num > 0)
{
binary = (num % 2) + binary; num = num / 2;
}
}
System.out.println("Binary equivalent of " + n + " is: " + binary); sc.close();
}
}
