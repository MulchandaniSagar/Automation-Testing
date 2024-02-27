package java_Projects;

public class SegregateAlphaNumeric {

	public static void main(String[] args) {
		
		String str = "Sagar1806";
		char c[] = str.toCharArray();
		boolean answer;
		
		for (int i=0 ; i<str.length() ;i++)
		{
			answer = Character.isDigit(c[i]);
			if (answer == true)
			{
				System.out.println("I am a Digit  " + c[i] + "  At index  " + i);
			}
			else
			{
				System.out.println("I am a Character  " + c[i]+ "  At index  " + i);
			}
		}
		
	}

}
