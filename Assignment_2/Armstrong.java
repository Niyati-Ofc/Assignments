public class Armstrong
{
public static void main(String[] args)
{
System.out.println("Armstrong numbers between 1 and 10000 are:"); for (int num = 1; num <= 10000; num++)
{
int n = num, sum = 0, digits = 0; int temp = num;
while (temp > 0)
{
digits++; temp /= 10;
}
temp = num; while (temp > 0)
{
int digit = temp % 10;
sum += Math.pow(digit, digits); temp /= 10;
}
if (sum == n)
{
System.out.println(n);
}
}
}
}
