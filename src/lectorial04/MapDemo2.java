package lectorial04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Double>> grades = new HashMap<String, ArrayList<Double>>();
		grades.put("Amy", new ArrayList<Double>(Arrays.asList(3.0, 15.0)));
		grades.put("John", new ArrayList<Double>(Arrays.asList(3.0, 15.0)));

		System.out.println(grades);
		System.out.println(grades.containsKey("Estrid"));
		System.out.println(grades.containsKey("John"));
		
		
		System.out.println(grades);
		Set<String> keys = grades.keySet();
		for(String key: keys) {
			ArrayList<Double> grade = grades.get(key);
			ArrayList<Double> newGrade = new ArrayList<Double>(Arrays.asList(1.0, 13.5));
			grades.put(key, newGrade);
		}
		
		System.out.println(grades);
		
		TreeMap<String, ArrayList<Double>> sortedGrades = new TreeMap<String, ArrayList<Double>>(grades);
		System.out.println(sortedGrades);
		
	}

}
