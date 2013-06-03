package employee;

public class Worker implements Employee {

	private String name;
	private double salary;
	public String role = "Worker";
	
	public Worker(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
		
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

	@Override
	public Worker makeWorker(String workerName, double salary) {
		return null;
	}
	
}
