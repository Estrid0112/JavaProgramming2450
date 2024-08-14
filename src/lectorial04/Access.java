package lectorial04;

import java.util.ArrayList;
import java.util.LinkedList;

public class Access {
	public static void main(String[] args) {
		// ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		list.get(list.size()/2);
		long end = System.currentTimeMillis();
		
		System.out.println("Time of access for ArrayList: " + (end - start));
		
		
		// ArrayList
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		for(int i = 0; i < 100000000; i++) {
			linkedlist.add(i);
		}
		
		start = System.currentTimeMillis();
		linkedlist.get(list.size()/2);
		end = System.currentTimeMillis();
		
		System.out.println("Time of access for LinkedList: " + (end - start));
	}
}