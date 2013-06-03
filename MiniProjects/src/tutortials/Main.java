package tutortials;


import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String [] things = {"hello", "what", "bye", "pie"};
		
		
		List<String> list1 = new ArrayList<String>();
		
		for(String x : things)
		{
			list1.add(x);
		}
		
		String[] morethings = {"pie", "bye"};
		
		List<String> list2 = new ArrayList<String>();
		
		for (String y : morethings)
		{
			list2.add(y);
		}
		
		coolmethod(list1, list2);
		
		System.out.println();
		
		for (String p : list1)
		{
			System.out.println(p  + " ");
		}
		
		
	}
	
	
	public static void coolmethod(Collection<String> l1, Collection<String> l2)
	{
		Iterator<String> it = l1.iterator();
		while (it.hasNext())
		{
			if(l2.contains(it.next()))
			{
				it.remove();
			}
		}
	}
		
		

	

}
