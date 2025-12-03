import java.util.Scanner; 
public class PalindromeS { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String str = sc.nextLine(); 
        String rev = ""; 
        for (int i = str.length() - 1; i >= 0; i--) { 
            rev = rev + str.charAt(i); 
        } 
        System.out.println("Reversed String: " + rev); 
        if (str.equalsIgnoreCase(rev)) { 
            System.out.println("The string is a palindrome."); 
        } else { 
            System.out.println("The string is NOT a palindrome."); 
        } 
        sc.close(); 
    } 
} 