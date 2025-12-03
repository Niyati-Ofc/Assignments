public class Student
{
public static void main(String[] args)
{
if (args.length != 9)
{
System.out.println("Error: Please provide exactly 9 arguments: <SIC> <Name>
<Branch> <m1> <m2> <m3> <m4> <m5> <m6>"); return;
}
String sic = args[0]; String name = args[1]; String branch = args[2]; int total = 0;
for (int i = 3; i < 9; i++)
{
total += Integer.parseInt(args[i]);
}
double average = total / 6.0; System.out.println("SIC: " + sic); System.out.println("Name: " + name); System.out.println("Branch: " + branch); System.out.println("Average Marks: " + average);
}
}
