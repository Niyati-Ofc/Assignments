import java.util.Scanner; 
 
class SquareThread extends Thread { 
 
    int num; 
 
    SquareThread(int n) { 
        num = n; 
    } 
 
    public void run() { 
        System.out.println("Square: " + (num * num)); 
    } 
} 
 
class SumThread extends Thread { 
 
    int num; 
 
    SumThread(int n) { 
        num = n; 
    } 
	  public void run() { 
        int sum = 0, n = num; 
        while (n > 0) { 
            sum += n % 10; 
            n /= 10; 
        } 
        System.out.println("Sum of digits: " + sum); 
    } 
} 
 
public class TwoThreads { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        SquareThread t1 = new SquareThread(num); 
        SumThread t2 = new SumThread(num); 
        t1.start(); 
        t2.start(); 
    } 
}