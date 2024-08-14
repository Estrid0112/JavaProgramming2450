package lectorial04;

import java.util.*;
public class MapTest {
   public static void main(String[] args) {
//	  Map<String, String> accountsMap = new TreeMap<String, String>();
	  Map<String, String> accountsMap = new TreeMap<String, String>(new Comparator<String>() {
		  public int compare(String o1, String o2) {
			  return o1.substring(1).compareTo(o2.substring(1));
		  }
	  });
      accountsMap.put("E123", "Charles");
      accountsMap.put("E174", "Matt");
      accountsMap.put("A542", "Brendan");
      accountsMap.put("E174", "Tobin");

      System.out.println(accountsMap);

      System.out.println(accountsMap.keySet());

      for (String en : accountsMap.keySet())
         System.out.println(accountsMap.get(en));
   }
}

