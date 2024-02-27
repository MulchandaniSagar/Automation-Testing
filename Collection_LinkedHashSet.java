package java_Projects;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Collection_LinkedHashSet {

	
	
	public static void main(String[] args) {
		
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add("Sagar");
		l1.add("Ashok");
		l1.add("Mulchandani");
		System.out.println(l1);
		l1.add("Komal");
		l1.add("Dhiraj");
		//Collections.sort(l1);
		System.out.println("1. LinkedHashSet Does not allow Sort");
		System.out.println("2. LinkedHashSet follows Indexing"+l1);
		l1.add(null);
		l1.add(null);
		System.out.println("3.LinkedHashSet only accepts one null: "+ l1);
		l1.add("Sagar");
		l1.add("Sagar");
		System.out.println("4. LinkedHashSet does not accepts Duplicate"+l1);
		System.out.println("5. LinkedHashSet  accepts Dynamic");
		l1.add(2);
		l1.add(true);
		System.out.println("6. LinkedHashSet Accepts Heterogeneous Values : "+l1);
		
		
	}
	
	
	
}
