package java_Projects;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_ArrayList {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add("Sagar");
		a1.add("Ajay");
		a1.add("Gaurav");
		a1.add("Kunal");
		a1.add("Bhagyesh");
		a1.add("Rahul");
		System.out.println("The Array List Is: "+a1);
		Collections.sort(a1); // sort and store it in a again
		System.out.println("The Sorted Array List is : "+a1);
		a1.add(null);
		System.out.println("Adding Null "+ a1);
		a1.add("Sarthi");
		//System.out.println(a1);
		a1.add(null);
		//System.out.println(a1);
		a1.add(null);
		System.out.println(a1); // Accepting Null Values
		a1.add("Sagar");
		a1.add("Sagar");
		System.out.println(a1); // Accepts Duplicate
		
		
		
		
		ArrayList a2 = new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(10);
		a2.add(100);
		a2.add(77);
		a2.add(16);
		System.out.println("The ArrayList 2 is : " +a2);
		Collections.sort(a2);
		System.out.println("The Sorted ArayList 2 is " + a2);
		a2.add(null);
		System.out.println("Adding Null " + a2);

	}

}
