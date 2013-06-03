import java.util.Scanner;



class Converter
{
	public String input;
	public Converter(String in)
	{
		input = in;
	}

	public String convertString()
	{

		int length = input.length();
		String curr;		
		String converted = "";
		String conv = "";
		for (int i=0; i<length; i++)
		{
			curr = input.substring(i, i+1);
			switch(curr)
			{
			case "a" : curr = "1.";
			break;
			case "b" : curr = "2.";
			break;
			case "c" : curr = "3.";
			break;
			case "d" : curr = "4.";
			break;
			case "e" : curr = "5.";
			break;
			case "f" : curr = "6.";
			break;
			case "g" : curr = "7.";
			break;
			case "h" : curr = "8.";
			break;
			case "i" : curr = "9.";
			break;
			case "j" : curr = "10.";
			break;
			case "k" : curr = "11.";
			break;
			case "l" : curr = "12.";
			break;
			case "m" : curr = "13.";
			break;
			case "n" : curr = "14.";
			break;
			case "o" : curr = "15.";
			break;
			case "p" : curr = "16.";
			break;
			case "q" : curr = "17.";
			break;
			case "r" : curr = "18.";
			break;
			case "s" : curr = "19.";
			break;
			case "t" : curr = "20.";
			break;
			case "u" : curr = "21.";
			break;
			case "v" : curr = "22.";
			break;
			case "w" : curr = "23.";
			break;
			case "x" : curr = "24.";
			break;
			case "y" : curr = "25.";
			break;
			case "z" : curr = "26.";
			break;
			case " " : curr = "0.";
			break;
			default : curr = "0.";
			break;
			}


			converted = converted + curr;

		}

		conv = converted.substring(0,converted.length()-1);
		return conv;
	}

}

public class Alphabet {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean boo = true;
		while (boo)
		{
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter a word or sentence or press q to quit: ");
			String input = sr.nextLine();
			input = input.toLowerCase();

			if (input.equals("q"))
			{
				System.out.println("Bye");
				boo=false;
			}

			else
			{
				Converter test = new Converter(input);
				String terst = test.convertString();
				System.out.println("Your words converted into numbers 1-26: " + terst);

			}

		}
	}

}
