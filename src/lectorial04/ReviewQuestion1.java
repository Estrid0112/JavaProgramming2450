package lectorial04;

import java.util.*;
public class ReviewQuestion1 {
   public static void main(String[] args) {
	  Map<String, String> accountsMap = new TreeMap<>(new Comparator<>() {
		  public int compare(String o1, String o2) {
			  return o1.substring(2).compareTo(o2.substring(2));
		  }
	  });
//	  Map<String, String> accountsMap = new TreeMap<>();
      accountsMap.put("E123", "Charles"); // ** 1
      accountsMap.put("E174", "Matt");
      accountsMap.put("E542", "Brendan"); // ** 3
      accountsMap.put("E174", "Tobin"); // ** 2

      System.out.println(accountsMap);

      System.out.println(accountsMap.keySet());

      for (String en : accountsMap.keySet())
         System.out.println(accountsMap.get(en));
   }
}

