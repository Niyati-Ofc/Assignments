import java.util.Scanner;

class Std 
{
    String name;
    int roll_no;
    String branch;

    void inputDetails() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter branch: ");
        branch = sc.nextLine();
    }

    void displayDetails() 
	{
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Branch: " + branch);
    }
}

public class Student
{
    public static void main(String[] args) 
	{
        Std s = new Std();
        s.inputDetails();
        s.displayDetails();
    }
}
