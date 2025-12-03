import java.util.Scanner; public class IncomeTax
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); double income, tax = 0;
System.out.print("Enter your taxable income: "); income = sc.nextDouble();
if (income < 150000)
{
tax = 0;
}
else if (income >= 150001 && income <= 300000)
{
tax = (income - 150000) * 0.10;
}
else if (income >= 300001 && income <= 500000)
{
tax = (150000 * 0.10) + (income - 300000) * 0.20;
}
else if (income >= 500001)
{
tax = (150000 * 0.10) + (200000 * 0.20) + (income - 500000) * 0.30;
}
System.out.println("Income: " + income); System.out.println("Calculated Tax: " + tax); sc.close();
}
}