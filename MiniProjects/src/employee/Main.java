package employee;

public class Main {

	
	public static void main (String[] args)
	{
		EmployeeMaker em = new EmployeeMaker();
		
		Employee joel =em.makeEmployee("Manager", "Joel", 80000.00);
		
		
		Worker joey = joel.makeWorker("Joey", 50000.00);
	}
}
