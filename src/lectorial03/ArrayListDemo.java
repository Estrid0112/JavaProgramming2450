package lectorial03;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
	    ArrayList<String> arrayList = new ArrayList<String>();
	    
	    arrayList.add("One");
	    arrayList.add("Three");
	    arrayList.add(new String("Five"));
	    arrayList.add(new String("Four"));
	    arrayList.add(1,"Two");
	    
	    arrayList.remove(3);
	    arrayList.add(4,"Five");
	    System.out.println("Displaying array list");
	    System.out.println(arrayList);
	    System.out.println(arrayList.getLast());
	    
	    ArrayList<Integer> integers = new ArrayList<Integer>();
	    
	    integers.add(1);
	    integers.add(0);
	    System.out.println(integers);
	    integers.remove(new Integer(0));
	    System.out.println(integers);

	}
}
