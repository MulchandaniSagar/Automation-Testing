package java_Projects;

public class AllCapsOrAllSmall {

	public static void main(String[] args) {
		String str ="GrOwTeCh MiNdS";	
		
		System.out.println(str.replaceAll(str,str.toUpperCase()));
		System.out.println(str.replaceAll(str,str.toLowerCase()));
	
		
	}
	
}
