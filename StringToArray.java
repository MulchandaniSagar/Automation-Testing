package seleniumProjects;

public class StringToArray {

	public static void main(String[] args) {
		String str = "Sagar";
		char c[] = str.toCharArray();
		for (int i=0 ; i<=str.length()-1 ; i++)
		
			{
				System.out.print(c[i]);
			}
	}

}
