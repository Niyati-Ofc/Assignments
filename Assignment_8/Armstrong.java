import java.util.Scanner; 
 
class ArmCheck implements Runnable { 
 
    int num; 
 
    ArmCheck(int n) {  
        num = n; 
    } 
 
    public void run() { 
        int n = num, sum = 0, d, temp = n; 
        while (n > 0) { 
            d = n % 10; 
            sum += d * d * d; 
            n /= 10; 
        } 
        if (sum == temp) { 
            System.out.println(temp + " is an Armstrong number");  
        }else { 
            System.out.println(temp + " is not an Armstrong number"); 
			   } 
    } 
} 
 
public class ArmStrong { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        Thread t = new Thread(new ArmCheck(num)); 
        t.start(); 
    } 
}
