package lectorial04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Search {
	public static void main(String[] args) {
		// ArrayList
		LinkedList<Integer> al = new LinkedList<>();
		for(int count=(int) 1e5; count<1e9; count = count*10) {
			for(int i=0; i<count; i++) {
				al.add(i);
			}
			
			long startTime = System.currentTimeMillis();
			System.out.println(al.contains(new Integer(-1)));
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			System.out.println("LinkedList with " + count + " elements" + " Running time: " + duration + " milliseconds");
		}
		System.out.println();
		
		// LinkedList
		LinkedList<Integer> ll = new LinkedList<>();
		for(int count=(int) 1e5; count<1e8; count = count*10) {
			for(int i=0; i<count; i++) {
				ll.add(i);
			}
			
			long startTime = System.currentTimeMillis();
			System.out.println(ll.contains(new Integer(-1)));
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			System.out.println("LinkedList Running time: " + duration + " milliseconds");
		}
		
		System.out.println();
		// HashSet
		HashSet<Integer> hs = new HashSet<>();
		for(int count=(int) 1e5; count<1e8; count = count*10) {
			for(int i=0; i<count; i++) {
				hs.add(i);
			}
			
			long startTime = System.currentTimeMillis();
			System.out.println(hs.contains(new Integer(-1)));
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			System.out.println("HashSet Running time: " + duration + " milliseconds");
		}
		System.out.println();
		
		//  HashMap
		HashMap<Integer, String> hm = new HashMap<>();
		for(int count=(int) 1e5; count<1e8; count = count*10) {
			for(int i=0; i<count; i++) {
				hm.put(i, new String("X"));
			}
			
			long startTime = System.currentTimeMillis();
			System.out.println(hm.containsKey(new Integer(-1)));
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			System.out.println("HashMap Running time: " + duration + " milliseconds");
		}
		
	}

}
