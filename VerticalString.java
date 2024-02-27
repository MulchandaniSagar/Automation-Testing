package java_Projects;

public class VerticalString {

	public static void main(String[] args) {
		
		String m1 = "software";
		String m2 = "testing";
		String m3 = m1.concat(m2);
		
		for (int i=0 ;i<m3.length();i++)
		{
			System.out.println(m3.toString().charAt(i));
		}
		

	}

}
