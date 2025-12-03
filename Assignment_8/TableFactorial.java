import java.util.Scanner; 
 
class TableThread extends Thread { 
 
    int num;
	TableThread(int n) { 
        num = n; 
    } 
 
    public void run() { 
        System.out.println("Multiplication Table of " + num + ":"); 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(num + " x " + i + " = " + (num * i)); 
        } 
    } 
} 
 
class FactorialThread extends Thread { 
 
    int num; 
 
    FactorialThread(int n) { 
        num = n; 
    } 
 
    public void run() { 
        long fact = 1; 
        for (int i = 1; i <= num; i++) { 
            fact *= i; 
        } 
        System.out.println("Factorial of " + num + ": " + fact); 
    } 
} 
 
public class TableFactorial { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        TableThread t1 = new TableThread(num); 
        FactorialThread t2 = new FactorialThread(num); 
        t1.start(); 
        t2.start(); 
        try { 
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) { 
            System.out.println(e); 
        } 
        System.out.println("Main thread finished after both threads completed."); 
    } 
}