package tester;

public class Manager extends Employee {

	
	
	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Worker addEmployee(String empName)
	{
		Worker newEmp = new Worker(empName);
		return newEmp;
		
	}


	

}
