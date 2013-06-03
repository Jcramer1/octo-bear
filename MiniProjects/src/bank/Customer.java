package bank;

public class Customer {

	private double savings=0;
	private int userAccountNo=0;
	public String userName;
	
	public Customer (String uname)
	{
		this.userName = uname;
		userAccountNo++;
		
	}
	public int getAccountNo()
	{
		return userAccountNo;
	}
	public String getuserName()
	{
		return userName;
	}
	public void deposit(double value)
	{
		savings += value;
	}
	public void withdraw(double value)
	{
		if(savings > value)
		{
		savings -= value;
		}
		else
		{
			System.out.println("Cannot withdraw that much");
		}
	}
	public double getAccountAmmount()
	{
		return savings;
	}
	
}
