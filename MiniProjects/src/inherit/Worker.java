package inherit;

public class Worker extends Employee {

	private int salary = 40;
	
	@Override
	public double getSalary()
	{
		return salary*Employee.mult;
	}
	
	
}
