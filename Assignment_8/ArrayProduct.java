import java.util.Scanner; 
 
class OddThread extends Thread { 
    int[] a, b, res; 
    OddThread(int[] a, int[] b, int[] res) { 
        this.a = a; 
        this.b = b; 
        this.res = res; 
    } 
    public void run() { 
        for (int i = 1; i < a.length; i += 2) 
            res[i] = a[i] * b[i]; 
    } 
} 
class EvenThread extends Thread { 
    int[] a, b, res; 
    EvenThread(int[] a, int[] b, int[] res) { 
        this.a = a; 
        this.b = b; 
        this.res = res; 
    } 
    public void run() { 
        for (int i = 0; i < a.length; i += 2) 
            res[i] = a[i] * b[i]; 
    } 
} 
 
public class ArrayProduct { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter array size: "); 
        int n = sc.nextInt(); 
        int[] a = new int[n]; 
        int[] b = new int[n]; 
        int[] res = new int[n]; 
        System.out.println("Enter elements of first array:"); 
        for (int i = 0; i < n; i++) a[i] = sc.nextInt(); 
        System.out.println("Enter elements of second array:"); 
        for (int i = 0; i < n; i++) b[i] = sc.nextInt(); 
        OddThread t1 = new OddThread(a, b, res); 
        EvenThread t2 = new EvenThread(a, b, res); 
        t1.start(); 
        t2.start(); 
        try { 
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {} 
        System.out.println("Resultant product array:");
		 for (int i = 0; i < n; i++) 
            System.out.print(res[i] + " "); 
        System.out.println(); 
    } 
} 

