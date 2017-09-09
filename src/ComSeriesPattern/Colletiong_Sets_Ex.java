package ComSeriesPattern;

import java.util.HashSet;
import java.util.Set;

public class Colletiong_Sets_Ex {
	// Hashset does not contain any ordering
	// Set stores only unique items
	
	// Linked hashset retain orders 
	public static void main(String[] args) 
	{
		Set<String> set1 = new HashSet<String>();
		
		set1.add("c");
		set1.add("c");
		set1.add("p");
		set1.add("b");
		set1.add("k");
		set1.add("z");
	
		System.out.println(set1);
		doprint(set1);
		
	}
	public static void doprint(Set<String> set11)
	{
		for(String st:set11)
		{
			System.out.println(st);
		}
	}
	
	
}
