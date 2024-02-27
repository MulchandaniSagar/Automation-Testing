package java_Projects;

public class ToUpperCaseAndLowerCase {

	public static void main(String[] args) {
		
		String str1 = "     Sagar";
		String str2 = "MULCHANDANI";
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.length());
		System.out.println("Non trimmed" + str1);
		System.out.println("Trimmed "+str1.trim());
		
		String str4 = str1.concat(" ").concat(str2);
		System.out.println(str4);
		System.out.println("Char at 0 "+ str4.charAt(15));
		
		
		
	

	}

}
