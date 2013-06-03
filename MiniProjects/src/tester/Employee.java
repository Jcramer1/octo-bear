package tester;

import java.util.ArrayList;

public abstract class Employee {

	private static ArrayList<Employee> empList = new ArrayList<Employee>();
	public String empName;
	
	public Employee (String name)
	{
		this.empName=name;
		this.addToList();
		
	}
	public void addToList()
	{
		empList.add(this);
	}
	public static void showList()
	{
		for(Employee e : empList)
		{
			System.out.println(e.empName);
			
		}
	}
	

}
