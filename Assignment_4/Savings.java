class Account 
{
    String customerName;
    long accountNumber;

    Account(String customerName, long accountNumber) 
	{
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    void display() 
	{
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account 
{
    double minBal;
    double savingBal;

    SavingsAccount(String customerName, long accountNumber, double minBal, double savingBal) 
	{
        super(customerName, accountNumber);
        this.minBal = minBal;
        this.savingBal = savingBal;
    }

    void show() 
	{
        super.display();
        System.out.println("Minimum Balance: " + minBal);
        System.out.println("Savings Balance: " + savingBal);
    }
}

class AccountDetails extends SavingsAccount
{
    double deposit;
    double withdrawal;

    AccountDetails(String customerName, long accountNumber, double minBal, double savingBal, double deposit, double withdrawal) 
	{
        super(customerName, accountNumber, minBal, savingBal);
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }

    void show1() 
	{
        super.show();
        System.out.println("Amount Deposited: " + deposit);
        System.out.println("Amount Withdrawn: " + withdrawal);
        double finalBalance = savingBal + deposit - withdrawal;
        System.out.println("Final Balance: " + finalBalance);
    }
}

public class Savings 
{
    public static void main(String[] args) 
	{
        AccountDetails customer1 = new AccountDetails("Niyati Sharma", 123456789, 1000.0, 5000.0, 2000.0, 1500.0);
        System.out.println("=== Customer Account Details ===");
        customer1.show1();
    }
}
