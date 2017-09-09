package ComSeriesPattern;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class Sorted_Maps_Ex {

	public static void main(String[] args) 
	{
		// Hashmap store the data in random order in table
		Map<Integer, String> hmp = new HashMap<Integer,String>();

		// Linked hash map store the data in the table in the way it is inserted 
		Map<Integer, String> lhmp = new LinkedHashMap<Integer,String>();
		
		// TreeHashMap sort the data by key and then store the data in the table.
		Map<Integer, String> thmp = new TreeMap<Integer,String>();
		
		//System.out.println(new temp());	
		System.out.println("Calling Hash Map");
		mapmeth(hmp);
		
		System.out.println("Calling Linked Hash Map");
		mapmeth(lhmp);
		
		System.out.println("Calling Tree Hash Map");
		mapmeth(thmp);
	}

	public static void mapmeth(Map<Integer,String> map)
	{
		map.put(8, "lion8");
		map.put(2, "lion2");
		map.put(7, "lion7");
		map.put(4, "lion4");
		map.put(9, "lion9");
		
		for(Integer a:map.keySet())
		{
			System.out.println("Key is :"+a+ " value is :" +map.get(a));
			
		}
	}
	
}
