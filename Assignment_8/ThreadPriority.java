class FirstThread extends Thread { 
    public void run() { 
        System.out.println("Running " + Thread.currentThread().getName()); 
    } 
} 
 
class SecondThread extends Thread { 
    public void run() { 
        System.out.println("Running " + 
Thread.currentThread().getName()); 
    } 
} 
 
public class ThreadPriority { 
    public static void main(String[] args) {
	  FirstThread t1 = new FirstThread(); 
        SecondThread t2 = new SecondThread(); 
        t1.setName("Thread-One"); 
        t2.setName("Thread-Two"); 
        t1.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.MAX_PRIORITY); 
        System.out.println(t1.getName() + " Priority: " + t1.getPriority()); 
        System.out.println(t2.getName() + " Priority: " + t2.getPriority()); 
        t1.start(); 
        t2.start(); 
    } 
}