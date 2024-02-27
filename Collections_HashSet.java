package java_Projects;

import java.util.Collections;
import java.util.HashSet;

public class Collections_HashSet {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add("Sagar");
		h1.add("Mulchandani");
		h1.add("Ashok");
		System.out.println(h1);
		h1.add("Komal");
		System.out.println(h1);
		//Collections.sort(h1);
		System.out.println("1. HashSet does not Accepts Sort");
		System.out.println("2. HashSet does not accepts Indexing");
		h1.add(null);
		h1.add(null);
		System.out.println(h1);
		System.out.println("3. HashSet Accepts Only one Null");
		h1.add("Sagar");
		System.out.println(h1);
		System.out.println("4. HashSet Does not accepts Duplicate");
		System.out.println("5. HashSet is Dynamic");
		h1.add(2);
		h1.add(true);
		System.out.println(h1);
		System.out.println("6. HashSet is Heterogeneous");
	}

}
