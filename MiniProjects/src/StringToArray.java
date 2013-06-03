import java.util.*;





public class StringToArray {

	/**
	 * @param args
	 */
	int length;
	
	public ArrayList arrayToArrayList(String[] x)
	{
		length = x.length;
		ArrayList<String> convert = new ArrayList<String>(length);
		
		
		for(int i = 0; i < length; i++)
		{
			convert.add(x[i]);
		}
		
		return convert;
		
	}
	public static Integer[] tri(Integer...x)
	{
		System.out.println(x);
		return x;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array1 = new String[3];
		array1[0] = "John";
		array1[1] = "Sally";
		array1[2] = "Bob";
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList(array1));
		
		for(String group: newList)
		{
			System.out.println(group);
		}
		
		String hi = new String("not bad");
		
		int[] sally = {1,2,3};
		
		
		
	}

}
