package java_Projects;

public class FindNoOfDigitsAndChar {

	public static void main(String[] args) {
		
		String str = "GroTechMinds37Batch";
		int count_Alpha = 0;
		int count_No = 0;
		boolean answer;
		
		
		char c1[] = str.toCharArray();
		
		for (int i = 0 ; i <str.length() ; i++)
		{
			answer = Character.isDigit(c1[i]);
			if (answer == true)
			{
				count_No++;
			}
			else
			{
				count_Alpha++;
			}
				
		}
		System.out.println("Total Numbers are " +count_No);
		System.out.println("Total Alphabets are" + count_Alpha);
		
	}

}
