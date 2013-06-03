package training;

public class EmployeeMaker {

	public Employee getEmpType(String emp)
	{
		if (emp.equalsIgnoreCase("Manager"))
		{
			return new Manager();
		}
		if (emp.equalsIgnoreCase("Worker"))
		{
			return new Worker();
		}
		return null;
	}
	
}
