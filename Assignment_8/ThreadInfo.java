class MyThread extends Thread { 
    public void run() { 
        System.out.println("Thread is running..."); 

    } 
} 
 
public class ThreadInfo { 
    public static void main(String[] args) { 
        MyThread t = new MyThread(); 
        System.out.println("Class: " + t.getClass().getName()); 
        System.out.println("Name: " + t.getName()); 
        System.out.println("Priority: " + t.getPriority()); 
        System.out.println("Thread Group: " + t.getThreadGroup().getName()); 
    } 
}