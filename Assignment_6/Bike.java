interface Servicing 
{
    void getServiceTime();
}

class Car implements Servicing 
{
    public void getServiceTime() 
	{
        System.out.println("Car Service Time: 4 hours");
    }
}

class Bike implements Servicing 
{
    public void getServiceTime() 
	{
        System.out.println("Bike Service Time: 2 hours");
    }
}

public class Bike
{
    public static void main(String[] args) 
	{
        Servicing car = new Car();
        Servicing bike = new Bike();

        car.getServiceTime();
        bike.getServiceTime();
    }
}
