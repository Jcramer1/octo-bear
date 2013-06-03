package employee;

public class EmployeeMaker {

	public Employee makeEmployee(String role, String name, double salary)
	{
		if (role.equals(null))
		{
			return null;
		}
		else if (role.equalsIgnoreCase("Manager"))
		{
			return new Manager(name, salary);
		}
		else if (role.equalsIgnoreCase("Worker"))
		{
			return new Worker(name, salary);
		}
		return null;
	}
	
}
