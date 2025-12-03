interface Printable 
{
    void print();
}

interface Showable 
{
    void show();
}

class Display implements Printable, Showable 
{
    public void print() 
	{
        System.out.println("Printing from Printable interface.");
    }

    public void show() 
	{
        System.out.println("Showing from Showable interface.");
    }
}

public class Inherit 
{
    public static void main(String[] args) 
	{
        Display d = new Display();
        d.print();
        d.show();
    }
}
