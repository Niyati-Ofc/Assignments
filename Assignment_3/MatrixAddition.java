import java.util.Scanner; public class MatrixAddition
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); System.out.print("Enter number of rows: "); int rows = sc.nextInt();
System.out.print("Enter number of columns: "); int cols = sc.nextInt();
int[][] A = new int[rows][cols];
int[][] B = new int[rows][cols];
int[][] B = new int[rows][cols];
 
int[][] sum = new int[rows][cols]; System.out.println("Enter elements of first matrix:"); for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
A[i][j] = sc.nextInt();
}
}
System.out.println("Enter elements of second matrix:"); for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
B[i][j] = sc.nextInt();
}
}
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
sum[i][j] = A[i][j] + B[i][j];
}
}
System.out.println("Resultant Matrix after Addition:"); for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
System.out.print(sum[i][j] + " ");
}
System.out.println();
}
sc.close();
}
}
