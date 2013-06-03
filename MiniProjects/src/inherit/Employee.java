package inherit;

public class Employee {

	public int salary = 100;
	public static double mult = .5;
	
	public double getSalary()
	{
		return (salary*mult);
	}
	
	class Shape
	{
		public Shape()
		{
			System.out.println("hello");
		}
	}
}
