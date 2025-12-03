import java.util.Scanner; 
 
class PalThread extends Thread { 
 
    int num; 
 
    PalThread(int n) { 
        num = n; 
    } 
 
    public void run() {  
        int n = num, rev = 0, d, temp = n; 
        while (n > 0) { 
            d = n % 10; 
            rev = rev * 10 + d; 
            n /= 10; 
        }
		  if (rev == temp) { 
            System.out.println(temp + " is a Palindrome number");  
        }else { 
            System.out.println(temp + " is not a Palindrome number"); 
        } 
    } 
} 
 
public class Palindrome { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        PalThread t = new PalThread(num); 
        t.start(); 
        boolean prime = true; 
        if (num <= 1) { 
            prime = false;  
        }else { 
            for (int i = 2; i <= num / 2; i++) { 
                if (num % i == 0) { 
                    prime = false; 
                    break; 
                } 
            } 
        } 
        if (prime) { 
            System.out.println(num + " is a Prime number");  
        }else { 
            System.out.println(num + " is a Composite number"); 
        } 
    } 
}