package btech;

class Student 
{
    String name;
    int rollNo;
    int marks1, marks2, marks3;

    public Student(String name, int rollNo, int marks1, int marks2, int marks3) 
	{
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void display() 
	{
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
    }

    public int getTotal() 
	{
        return marks1 + marks2 + marks3;
    }

    public double getPercentage() 
	{
        return getTotal() / 3.0;
    }
}

public class Pack 
{
    public static void main(String[] args) 
	{
        Student s = new Student("Niyati Sharma", 101, 85, 90, 80);

        s.display();

        int total = s.getTotal();
        double percentage = s.getPercentage();

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
