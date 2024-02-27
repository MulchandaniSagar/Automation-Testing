package java_Projects;

public class GetCapsFromStr {

	public static void main(String[] args) {
	
		String str = "My Name Is Sagar Mulchandani";
		System.out.println("The Original String is: " + str);
		String str2 = str.replaceAll("[a-z]", "");
		System.out.println("Only Capital Letters from String are : " +str.replaceAll("[a-z]", ""));
		str2.replaceAll(" ", "");
		System.out.println("The String after Removing Spaces is : " + str2.replaceAll(" ", ""));

	}

}
