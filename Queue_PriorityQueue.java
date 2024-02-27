package java_Projects;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.PriorityQueue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue p1 = new PriorityQueue();
		p1.add("Sagar");
		p1.add("Ashok");
		p1.add("Mulchandani");
		System.out.println(p1);
		//Collections.sort(p1);
		System.out.println("1. The PriorityQueue does not allow Sorting");
		p1.add("Komal");
		System.out.println("2. The PriorityQueue does not follow Indexing : " +p1);
		//p1.add(null);
		//p1.add(null);
		System.out.println("3. The PriorityQueue does not accepts Null Values: "+p1);
		p1.add("Dhiraj");
		p1.add("Bhavya");
		System.out.println("4. The PriorityQueue is Dynamic: "+p1);
		p1.add("Sagar");
		p1.add("Sagar");
		p1.add("Dhiraj");
		p1.add("Dhiraj");
		System.out.println("5. The PriorityQueue Allows Duplicate : "+p1);
		
		//p1.add(true);
		//p1.add(3);
		//p1.add(false);
		System.out.println("6. The PriorityQueue does not allow Heterogeneous Values:  "+p1);
		
		PriorityQueue p2 = new PriorityQueue();
		p2.add(1.0);
		//p2.add(2);
		p2.add(1.1);

		System.out.println(p2);
		
		
		PriorityQueue p3 = new PriorityQueue();
		p3.add('c');
		System.out.println(p3);
		
		
		//p2.add("Sagar");
		
		int a1[] = new int[10];
		
		
		
	}

}
