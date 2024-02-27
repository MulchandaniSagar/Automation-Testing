package java_Projects;

import java.util.Collections;
import java.util.TreeSet;

public class Collection_TreeSet {

	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add("Sagar");
		t1.add("Ashok");
		t1.add("Mulchandani");
		System.out.println("1. TreeSet Does not allow Sort"+t1);
		System.out.println("2. TreeSet Does not allow Indexing" + t1);
		//t1.add(null);
		//t1.add(null);
		//Collections.sort(t1);
		System.out.println("3. TreeSet does not Accept Null"+t1);
		System.out.println("4. TreeSet Accepts Dynamic");
		t1.add("Sagar");
		t1.add("Sagar");
		System.out.println("5. Tree Set Does not accepts Duplicate Value: "+t1);
		//t1.add(12);
		//t1.add(true);
		System.out.println("6. TreeSet Does not accepts Heterogeneous Values"+t1);
		
		

	}

}
