package java_Projects;

public class ReplaceAllChecker {

	public static void main(String[] args) {
	
		String str = "Sagar Mulchandani";
		str.replace("a", "b");
		System.out.println(str.replace("a", "b"));
		str.replaceAll("a", "S");
		System.out.println(str.replaceAll("a", "S"));
		str.replaceFirst("S", "G");
		System.out.println(str.replaceFirst("S", "G"));
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str.replace("S", "s"));
		

	}

}
