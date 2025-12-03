import java.util.Scanner;
class Empl 
{
    int empid;
    String ename;
    String dept;
    double sal;

    void getData() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Department: ");
        dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        sal = sc.nextDouble();
    }

    void putData() 
	{
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + sal);
        System.out.println("---------------------------");
    }
}

public class Employee 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Empl[] emp = new Empl[n];
        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            emp[i] = new Empl();
            emp[i].getData();
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) 
		{
            emp[i].putData();
        }
        sc.close();
    }
}
