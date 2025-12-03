import java.util.Scanner; public class Jagged
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); System.out.print("Enter number of rows: "); int rows = sc.nextInt();
int[][] jag = new int[rows][]; for (int i = 0; i < rows; i++)
{
System.out.print("Enter number of columns for row " + (i + 1) + ": "); int cols = sc.nextInt();
jag[i] = new int[cols];

System.out.println("Enter elements for row " + (i + 1) + ":"); for (int j = 0; j < cols; j++)
{
jag[i][j] = sc.nextInt();
}
}
System.out.println("Jagged Array:"); for (int i = 0; i < rows; i++)
{
for (int j = 0; j < jag[i].length; j++)
{
System.out.print(jag[i][j] + " ");
}
