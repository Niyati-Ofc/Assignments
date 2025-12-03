import java.util.Scanner;


public class Linear
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); System.out.print("Enter number of elements in the array: "); int n = sc.nextInt();
int[] arr = new int[n]; System.out.println("Enter " + n + " elements:"); for (int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}
System.out.print("Enter the element to search: "); int key = sc.nextInt();
int found = 0;
for (int i = 0; i < n; i++)
{
if (arr[i] == key)
{
System.out.println("Element " + key + " found at position " + (i + 1)); found = 1;
break;
}
}


if (!found)
{
System.out.println("Element " + key + " not found in the array.");
}


sc.close();
}
}
