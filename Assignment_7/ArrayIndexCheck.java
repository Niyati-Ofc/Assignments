import java.util.Scanner;

public class ArrayIndexCheck 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int index;

        System.out.print("Enter index position (0 to " + (arr.length - 1) + "): ");
        index = sc.nextInt();

        try 
		{
            System.out.println("Value at index " + index + " = " + arr[index]);
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Error: Invalid index! Please enter a value between 0 and " + (arr.length - 1) + ".");
        }

        sc.close();
    }
}
