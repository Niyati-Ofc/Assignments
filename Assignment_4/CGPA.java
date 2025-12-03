import java.util.Scanner;
class Student 
{
    int regNo;
    String stdName;
    String branch;
    double CGPA;

    void accept() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        stdName = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        CGPA = sc.nextDouble();
    }

    void display() 
	{
        System.out.println("Registration Number: " + regNo);
        System.out.println("Student Name: " + stdName);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + CGPA);
        System.out.println("---------------------------");
    }
}

public class CGPA 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        for (int i = 0; i < 5; i++) 
		{
            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            s[i] = new Student();
            s[i].accept();
        }
        double maxCGPA = s[0].CGPA;
        int count = 0;
        for (int i = 1; i < 5; i++) 
		{
            if (s[i].CGPA > maxCGPA) 
			{
                maxCGPA = s[i].CGPA;
                count = i;
            }
        }
        System.out.println("\nStudent with Highest CGPA:");
        s[count].display();

        sc.close();
    }
}
