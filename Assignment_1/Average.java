import java.util.Scanner;
class Average 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
        	System.out.print("Enter your marks in English: ");
        	float english = sc.nextFloat();
        	System.out.print("Enter your marks in Maths: ");
        	float maths = sc.nextFloat();
        	System.out.print("Enter your marks in Science: ");
        	float science = sc.nextFloat();
       	float average = (english + maths + science) / 3;
		        System.out.println("The average marks in 3 subjects is " + average);
    }
}

