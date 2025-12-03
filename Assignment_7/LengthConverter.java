import java.util.Scanner;

class InvalidLengthException extends Exception 
{
    public InvalidLengthException(String message) 
	{
        super(message);
    }
}

public class LengthConverter 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        while (true) 
		{
            try 
			{
                System.out.print("Enter length in feet: ");
                double feet = sc.nextDouble();

                System.out.print("Enter length in inches: ");
                double inches = sc.nextDouble();

                if (feet < 0 || inches < 0) 
				{
                    throw new InvalidLengthException("Negative values are not allowed.");
                }

                double totalInches = (feet * 12) + inches;
                double centimetres = totalInches * 2.54;

                System.out.println("Equivalent length in centimetres: " + centimetres);
                break;
            } 
            catch (InvalidLengthException e) 
			{
                System.out.println("Error: " + e.getMessage() + " Please enter again.\n");
                sc.nextLine();
            } 
            catch (java.util.InputMismatchException e) 
			{
                System.out.println("Error: Only numeric values are allowed. Please enter again.\n");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
