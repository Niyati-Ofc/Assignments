import java.util.Scanner;

class MinimumBalanceException extends Exception 
{
    public MinimumBalanceException(String message) 
	{
        super(message);
    }
}

class Account 
{
    String name;
    long acc_no;
    double balance;

    Account(String name, long acc_no, double balance) 
	{
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void deposit(double amt) 
	{
        balance += amt;
        System.out.println("Amount deposited: " + amt);
        System.out.println("Updated balance: " + balance);
    }

    void withdraw(double amt) throws MinimumBalanceException 
	{
        if (balance - amt < 500) 
		{
            throw new MinimumBalanceException("Withdrawal denied! Minimum balance of 500 must be maintained.");
        } 
		else 
		{
            balance -= amt;
            System.out.println("Amount withdrawn: " + amt);
            System.out.println("Updated balance: " + balance);
        }
    }

    void transfer(Account acc1, Account acc2, double amt) throws MinimumBalanceException 
	{
        if (acc1.balance - amt < 500) 
		{
            throw new MinimumBalanceException("Transfer denied! Minimum balance of 500 must be maintained in sender’s account.");
        } 
		else 
		{
            acc1.balance -= amt;
            acc2.balance += amt;
            System.out.println("Transferred " + amt + " from " + acc1.name + " to " + acc2.name);
            System.out.println(acc1.name + " updated balance: " + acc1.balance);
            System.out.println(acc2.name + " updated balance: " + acc2.balance);
        }
    }
}

public class BankTransfer 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name for Account 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number for Account 1: ");
        long accNo1 = sc.nextLong();
        System.out.print("Enter initial balance for Account 1: ");
        double bal1 = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter name for Account 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account number for Account 2: ");
        long accNo2 = sc.nextLong();
        System.out.print("Enter initial balance for Account 2: ");
        double bal2 = sc.nextDouble();

        Account a1 = new Account(name1, accNo1, bal1);
        Account a2 = new Account(name2, accNo2, bal2);

        System.out.print("Enter amount to deposit in Account 1: ");
        double dep = sc.nextDouble();
        a1.deposit(dep);

        System.out.print("Enter amount to withdraw from Account 1: ");
        double wd = sc.nextDouble();
        try 
		{
            a1.withdraw(wd);
        } 
		catch (MinimumBalanceException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Enter amount to transfer from Account 1 to Account 2: ");
        double trans = sc.nextDouble();
        try 
		{
            a1.transfer(a1, a2, trans);
        } 
		catch (MinimumBalanceException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
