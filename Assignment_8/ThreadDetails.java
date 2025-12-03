public class ThreadDetails { 
 
    public static void main(String[] args) { 
 
        Thread t = Thread.currentThread(); 
 
        System.out.println("Thread Class: " + t.getClass().getName()); 
        System.out.println("Thread Name: " + t.getName()); 
        System.out.println("Thread Priority: " + t.getPriority()); 
        System.out.println("Thread Group: " + t.getThreadGroup().getName()); 
    } 
}