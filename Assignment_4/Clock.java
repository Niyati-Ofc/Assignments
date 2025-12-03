import java.util.Scanner;

class Time
{
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) 
	{
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void displayTime() 
	{
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    Time addTime(Time t) 
	{
        int totalSeconds = this.second + t.second;
        int totalMinutes = this.minute + t.minute + totalSeconds / 60;
        int totalHours = this.hour + t.hour + totalMinutes / 60;

        int newSecond = totalSeconds % 60;
        int newMinute = totalMinutes % 60;
        int newHour = totalHours % 24; // Assuming 24-hour format

        return new Time(newHour, newMinute, newSecond);
    }
}

public class Clock
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time:");
        System.out.print("Hours: ");
        int h1 = sc.nextInt();
        System.out.print("Minutes: ");
        int m1 = sc.nextInt();
        System.out.print("Seconds: ");
        int s1 = sc.nextInt();

        System.out.println("\nEnter second time:");
        System.out.print("Hours: ");
        int h2 = sc.nextInt();
        System.out.print("Minutes: ");
        int m2 = sc.nextInt();
        System.out.print("Seconds: ");
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        System.out.print("\nFirst Time: ");
        t1.displayTime();
        System.out.print("Second Time: ");
        t2.displayTime();

        Time sum = t1.addTime(t2);
        System.out.print("Sum of Times: ");
        sum.displayTime();

        sc.close();
    }
}
