package lectorial03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
	    LinkedList<String> ex = new LinkedList<String>();
	    LinkedList<String> lList = new LinkedList<String>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
	    lList.addFirst(lList.removeLast());
	    lList.add(1,new String("Nine"));
	    System.out.println("Displaying linked list Forward");
	    ListIterator<String> lIt = lList.listIterator();
	    while (lIt.hasNext())
	        System.out.println(lIt.next());
	    System.out.println("Displaying linked list Backward");
	    lIt = lList.listIterator(lList.size());
	    while (lIt.hasPrevious())
	        System.out.println(lIt.previous());
	}


}
 