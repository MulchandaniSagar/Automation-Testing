package java_Projects;

import java.util.Collections;
import java.util.PriorityQueue;

public class Collection_PriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue p1 = new PriorityQueue();
		p1.add("Sagar");
		p1.add("Ashok");
		p1.add("Mulchandani");
		System.out.println(p1);
		//Collections.sort(p1);
		System.out.println("1. PriorityQueue does not Sort");
		System.out.println("2. Priority Queue Does not Support Indexing");
		//p1.add(null);
		//p1.add(null);
		System.out.println("3. Priority Queue Does not accepts Null " +p1);
		System.out.println("4. Priority Queue is Dynamic");
		p1.add("Ashok");
		p1.add("Ashok");
		System.out.println("5. PriorityQueue Supports Duplicate" + p1);
		//p1.add(2);
		//p1.add(true);
		System.out.println("6. PriorityQueue Does not supports Heterogeneous Values" + p1);
		
	}

}
