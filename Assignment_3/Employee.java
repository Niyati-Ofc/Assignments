public class Employee
{
String empId; String empName; String deptNo; double salary;

void display()
{
System.out.println("Employee ID: " + empId); System.out.println("Employee Name: " + empName); System.out.println("Department No: " + deptNo); System.out.println("Salary: " + salary);
}

public static void main(String[] args) { if (args.length != 4)
{
System.out.println("Error: Please provide exactly 4 arguments: <empId> <empName>
<deptNo> <salary>"); return;
}

Employee e = new Employee(); e.empId = args[0];
e.empName = args[1]; e.deptNo = args[2];
e.salary = Double.parseDouble(args[3]);

e.display();
}
}
