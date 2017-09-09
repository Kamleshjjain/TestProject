package ComSeriesPattern;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex {

	public static void main(String[] args) {

		// HashMap does not maintain ordering.
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		// Map can't have duplicate values
		map.put(1,"test1");
		map.put(2, "test2");
		map.put(3, "test3");
		map.put(2, "no duplicate");
		
//		String val1=map.get(2);
//		System.out.println(val1);
		
		//map.put(, value)
		
		for(Map.Entry<Integer,String> entry:map.entrySet())
		{
		System.out.println(entry.getValue());
		}
		
		
	}
	
}
