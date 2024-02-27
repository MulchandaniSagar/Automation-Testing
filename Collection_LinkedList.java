package java_Projects;

import java.util.Collections;
import java.util.LinkedList;

public class Collection_LinkedList {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.add("Sagar");
		l1.add("Mulchandani");
		l1.add("Ajay");
		Collections.sort(l1);
		
		
		LinkedList l2 = new LinkedList();
		l2.add("Sagar");
		l2.add(true);
		l2.add(false);
		l2.add(11);
		System.out.println("1. Linked List Accepst Heterogeneous values: "+ l2);
		System.out.println("2. Linked List can Sort the values : " +l1);
		l1.add("Indexing");
		System.out.println("3. Linked List Follows Indexing : "+ l1);
		l1.add(null);
		l1.add(null);
		l1.add(null);
		System.out.println("4. Linked List Accepts Null : "+ l1);
		l1.add("Dynamic");
		System.out.println("5. Linked List is Dynamic :" + l1);
		l1.add("Ajay");
		l1.add("Ajay");
		System.out.println("6. Linked List  accepts Duplicate : " + l1);
		
		
		
		

	}

}
