package lectorial04;


import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<Integer> array1 = new LinkedList<Integer>();
		array1.add(1);

		for(int i=2; i < 5; i++) {
			array1.add(i);
		}
		System.out.println(array1);
		
		System.out.println(array1.contains(1));
		System.out.println("Index of 2 is: " + array1.indexOf(2));
		
		array1.remove(1);
		System.out.println(array1);
		System.out.println("Index of 2 is: " + array1.indexOf(2));
		
		array1.remove(new Integer(1));
		System.out.println(array1);
		// initialization
		LinkedList<Integer> array2 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4)); 
	}

}
