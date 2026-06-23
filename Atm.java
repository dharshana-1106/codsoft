import java.util.*;
class BankAccount
{
	double balance;
	public void BackAccount(double initicial_balance)
	{
		if(initicial_balance>=0)
			this.balance=initicial_balance;
		else
			this.balance=0;
	}
	public void deposite(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Successfully Deposited: Rs."+amount);
		}
		else
			System.out.println("Invalid Deposite Amount!");
	}
	public void withdraw(double amount)
	{
		if(amount<=balance && amount>0)
		{
			balance-=amount;
			System.out.println("Successfully Withdrawn: Rs."+amount);
		}
		else
			System.out.println("Insufficient Balance!");
	}
	public void checking()
	{
		if(balance<1000)
			System.out.println("Balance Amount: Rs."+balance+" "+"Please Maintain Minimum Bank Balance!");
		else
			System.out.println("Balance Amount: Rs."+balance);
	}
}
class Atm 
{	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		BankAccount ob=new BankAccount();
		int ch;
		System.out.println("_____WELCOME TO THE ATM_____");
		do {
			System.out.println("\n_____Choose Your Choice:_____");
			System.out.println("\n1. Deposite Money.");
			System.out.println("\n2. Withdraw Money.");
			System.out.println("\n3. Check Balance");
			System.out.println("\n4. Exit.");
			System.out.print("\nEnter Your Choice:");
			ch=s.nextInt();
		    switch(ch)
		    {
		    case 1:
		    	System.out.print("Enter Deposite Amount: Rs.");
		    	double deposite_amt=s.nextDouble();
		    	ob.deposite(deposite_amt);
		    	break;
		    case 2:
		    	System.out.print("Enter Withdrawal Amount: Rs.");
		    	double withdraw_amt=s.nextDouble();
		    	ob.withdraw(withdraw_amt);
		    	break;
		    case 3:
		    	System.out.println("Current Balance:");
		    	ob.checking();
		        break;
		    case 4:
		    	System.out.println("THANK YOU!");
		    	break;
		    default:
		    	System.out.println("Invalid Choice! Please Select a Valid Option");
		    }
		}
		while(ch!=4);
		}
	}

	
