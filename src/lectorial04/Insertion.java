package lectorial04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Insertion {
	public static void main(String[] args) {
		// Number of elements to insert and delete
		for (int n = 1000; n < 1e6; n=n*10) {  
			System.out.println("===Inserting and deleting " + n + " elements===");
	        // ArrayList insertion and deletion benchmark
	        long arrayListStartTime = System.currentTimeMillis();
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            arrayList.add(i);
	        }
	        for (int i = 0; i < n; i++) {
	            arrayList.remove(0);
	        }
	        long arrayListEndTime = System.currentTimeMillis();
	        long arrayListDuration = arrayListEndTime - arrayListStartTime;
	        System.out.println("ArrayList insertion and deletion time: " + arrayListDuration + " milliseconds");
	        
	        // LinkedList insertion and deletion benchmark
	        long linkedListStartTime = System.currentTimeMillis();
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        for (int i = 0; i < n; i++) {
	            linkedList.add(i);
	        }
	        for (int i = 0; i < n; i++) {
	            linkedList.remove(0);
	        }
	        long linkedListEndTime = System.currentTimeMillis();
	        long linkedListDuration = linkedListEndTime - linkedListStartTime;
	        System.out.println("LinkedList insertion and deletion time: " + linkedListDuration + " milliseconds");
	        
	        // HashSet insertion and deletion benchmark
	        long setStartTime = System.currentTimeMillis();
	        HashSet<Integer> set = new HashSet<>();
	        for (int i = 0; i < n; i++) {
	            set.add(i);
	        }
	        for (int i = 0; i < n; i++) {
	            set.remove(i);
	        }
	        long setEndTime = System.currentTimeMillis();
	        long setDuration = setEndTime - setStartTime;
	        System.out.println("HashSet insertion and deletion time: " + setDuration + " milliseconds");
	        
	        // HashMap insertion and deletion benchmark
	        long mapStartTime = System.currentTimeMillis();
	        HashMap<Integer, String> map = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            map.put(i, "");
	        }
	        for (int i = 0; i < n; i++) {
	            map.remove(i);
	        }
	        long mapEndTime = System.currentTimeMillis();
	        long mapDuration = mapEndTime - mapStartTime;
	        System.out.println("HashMap insertion and deletion time: " + mapDuration + " milliseconds");
	        
		}
	}

}
