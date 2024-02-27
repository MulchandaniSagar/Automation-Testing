package java_Projects;

public class ReversOfFullString {

	public static void main(String[] args) {
		
		String name = "My Name is Manish Kumar Tiwari";
		
		for(int i = name.length()-1 ; i>=0 ; i--)
		{
			
			System.out.println(name.toString().charAt(i));
			
		}
	}

}
