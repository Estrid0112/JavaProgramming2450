package lectorial04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class MapDemo{ 
    public static void main(String[] args){ 
        HashMap<String, Account> hashMap = new HashMap<>();
        
        
        hashMap.put("Charles Theva", new Account("S123",130.0));
        hashMap.put("Bill Cooper", new Account("S124",90.0));
        hashMap.put("Abraham Lincoln", new Account("S126",220.0));
        hashMap.put("Bill Cooper", new Account("S124",120.0));
        hashMap.put("Alice Smith", new Account("S125", 0.0));
        
        
        
        System.out.println("Entries in Hashmap");
        displayMap(hashMap);
        
        System.out.println("\nEntries in Treemap");
       // TreeMap<String, Account> treeMap = new TreeMap<>();
        TreeMap<String, Account> treeMap = new TreeMap<>(hashMap);
        displayMap(treeMap);
    }
    
    public static void displayMap(Map<String, Account> m){
   	      	
        Set<String> keySet = m.keySet();
        // One way of iterating the map
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            String key = (String) iterator.next();
//            System.out.println(key + ":" + m.get(key) );
//        }
        
        for(String key: keySet) {
        	System.out.println(key + ":" + m.get(key) );
        }
              
    }
}

