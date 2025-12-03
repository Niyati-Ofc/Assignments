import java.util.Scanner; 
 
class SumThread extends Thread { 
    int start, end; 
    static long sum = 0; 
    static Object lock = new Object(); 
    SumThread(int start, int end) { 
        this.start = start; 
        this.end = end; 
    } 
    public void run() { 
        long temp = 0; 
        for (int i = start; i <= end; i++) 
            temp += i; 
        synchronized (lock) { 
            sum += temp; 
        } 
    } 
}
public class Natural { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter n (limit): "); 
        int n = sc.nextInt(); 
        System.out.print("Enter number of threads (m): "); 
        int m = sc.nextInt(); 
        int range = n / m; 
        SumThread[] threads = new SumThread[m]; 
        int start = 1; 
        for (int i = 0; i < m; i++) { 
            int end = (i == m - 1) ? n : start + range - 1; 
            threads[i] = new SumThread(start, end); 
            threads[i].start(); 
            start = end + 1; 
        } 
        for (int i = 0; i < m; i++) { 
            try { 
                threads[i].join(); 
            } catch (InterruptedException e) {} 
        } 
        System.out.println("Sum of first " + n + " natural numbers: " + SumThread.sum); 
    } 
}