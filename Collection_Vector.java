package java_Projects;

import java.util.Collections;
import java.util.Vector;

public class Collection_Vector {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		System.out.println("Checking Heterogeneous Values");
		v1.add("Sagar");
		v1.add(18);
		v1.add(06);
		v1.add(true);
		v1.add('S');
		v1.add(33.33f);
		System.out.println(v1);
		System.out.println("1. Vectors accepts Heterogeneous Values");
		
		Vector v2 = new Vector();
		v2.add("Sagar");
		v2.add("Mulchandani");
		System.out.println("Un-Sorted : " + v2);
		Collections.sort(v2);
		System.out.println("2. Sorted : "+v2);
		System.out.println("3. Vectors Allow Sorting");
		v2.add("Ram");
		v2.add("Krishna");
		System.out.println("Vector follow Indexing : " +v2);
		v2.add(null);
		System.out.println("Single Null Check" + v2);
		v2.add(null);
		v2.add(null);
		System.out.println("4. Vector can add more than one Null Value  : "+v2);
		System.out.println("5. The Vector is Dynamic");
		v2.add("Mulchandani");
		System.out.println("One Duplicate " + v2);
		v2.add("Mulchandani");
		System.out.println("6. The Vector Support more than one Duplicate : "+ v2);
		
		

	}

}
