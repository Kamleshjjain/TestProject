package ComSeriesPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_Ex {
public static void main(String[] args) 
{

ArrayList<String> arl = new ArrayList<String>();
LinkedList<String> lls = new LinkedList<String>();
	lls.add("a");
	lls.add("c");
	lls.add("d");
	lls.add("c");
	
	arl.add("A");
	arl.add("B");
	arl.add("D");
	arl.add("C");
	
	System.out.println("Printing values of Linked list first");
	doprint(lls);
	System.out.println("Printing values of Array list");
	doprint(arl);
	
}
public static void doprint(List<String> ll)	
{

	Iterator itr = ll.iterator();

	// now use list iterator 
	
	ListIterator<String> litr = ll.listIterator();
	
	while(litr.hasNext())
	
	{
	System.out.println(litr.next());
	}

	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}	
	
}
}
