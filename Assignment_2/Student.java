import java.util.Scanner; public class Student
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); int s1, s2, s3, s4;
double average; char grade;
System.out.print("Enter marks in Subject 1: "); s1 = sc.nextInt();
System.out.print("Enter marks in Subject 2: "); s2 = sc.nextInt();
System.out.print("Enter marks in Subject 3: "); s3 = sc.nextInt();
System.out.print("Enter marks in Subject 4: "); s4 = sc.nextInt();
average = (s1 + s2 + s3 + s4) / 4.0; 
if (average >= 90)
{
grade = 'O';
}
else if (average >= 80)
{
grade = 'E';
}
else if (average >= 70)
{
grade = 'A';
}
else if (average >= 60)
{
grade = 'B';
}
else if (average >= 50)
{
grade = 'C';
}
else
{
grade = 'F';
}
System.out.println("Average Marks = " + average); System.out.println("Grade = " + grade);
sc.close();
}
}
