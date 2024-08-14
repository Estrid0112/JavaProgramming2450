package lectorial04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<>();
		
		mySet.add("This");
		mySet.add("is");
		mySet.add("my");
		mySet.add("first");
		mySet.add("Java");
		mySet.add("class");
		
		// No duplicates allowed
		System.out.println("HashSet: " + mySet);
		mySet.add("Java");
		System.out.println("HashSet: " + mySet);
		
		
		
		// LinkedHashSet
		LinkedHashSet<String> lsh = new LinkedHashSet<String>();
		lsh.add("This");
		lsh.add("is");
		lsh.add("my");
		lsh.add("first");
		lsh.add("Java");
		lsh.add("class");
		System.out.println("LinkedHashSet:" + lsh);
		lsh.add("Java");
		System.out.println("LinkedHashSet: " + lsh);
		
		
		// TreeSet
		TreeSet<Account> myAccounts = new TreeSet<Account>();
		myAccounts.add(new Account("def", 100.0));
		myAccounts.add(new Account("abc", 0.0));
		System.out.println("TreeSet of Accounts:" + myAccounts);
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("This");
		ts.add("is");
		ts.add("my");
		ts.add("first");
		ts.add("Java");
		ts.add("class");
		System.out.println("TreeSet:" + ts);
		
		// Remove duplicated elements within the array
		
		ArrayList<String> array = new ArrayList<String>(Arrays.asList("a", "b", "a")); 
		HashSet<String> mySet2 = new HashSet<>(array);
		System.out.println(mySet2);

	}

}
