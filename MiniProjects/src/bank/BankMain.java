package bank;

import java.util.Scanner;

public class BankMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter userName: ");
		String username = sc.next();
		if (username.equalsIgnoreCase("joey"))
		{
			Customer cust = new Customer(username);
			while(check)
			{
				String next = sc.next();
				
				if (next.equals("d"))
				{
					System.out.println("How much to deposit?: ");
					double deposit = sc.nextDouble();
					cust.deposit(deposit);
					check = true;
				}
				else if (next.equals("w"))
				{
					System.out.println("How much to withdraw?: ");
					double withdraw = sc.nextDouble();
					cust.withdraw(withdraw);
					check = true;
				}
				else if (next.equals("a"))
				{
					
					System.out.println("You have "+cust.getAccountAmmount() +"$ in your account");
					check = true;
				}
				else if (next.equals("an"))
				{
					System.out.println("Your account number is "+ cust.getAccountNo()+".");
					check = true;
				}
				else if (next.equals("q"))
				{
					System.out.println("Goodbye");
					check = false;
				}
				
			
					
				
				
			}
		}
	}

}
