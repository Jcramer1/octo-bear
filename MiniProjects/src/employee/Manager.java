package employee;

public class Manager implements Employee {

	private String name;
	private double salary;
	public String role = "Manager";
	
	public Manager(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public Worker makeWorker(String workerName, double salary)
	{
		
		return new Worker(workerName, salary);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
