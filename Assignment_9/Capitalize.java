import java.util.Scanner; 
 
public class Capitalize { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter a sentence: "); 
        String sentence = sc.nextLine(); 
 
        String[] words = sentence.split(" "); 
        String result = ""; 
 
        for (String w : words) { 
            if (w.length() > 0) { 
                result += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " "; 
            } 
        } 
 
        System.out.println(result.trim()); 
        sc.close(); 
    } 
}