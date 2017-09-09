package ComSeriesPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Ex {

public static void main(String[] args) {
	
//	ArrayList<String> arl = new ArrayList<String>();
//	arl.add("This");
//	arl.add("is");
//	arl.add("test");
//	arl.add("from");
//	
//	for(String st:arl)
//	{
//		System.out.println(st);
//	}
//	
//	System.out.println("Other for");
//	
//	for(int i=0;i<arl.size();i++)
//	{
//		System.out.println(arl.get(i));
//	}
//
//	arl.remove(arl.size()-1);
//
//	Iterator itr = arl.iterator();
//		
//		System.out.println("Using while");
//		
//	// using while loop
//
//		while(itr.hasNext())
//	{
//	
//		System.out.println(itr.next());
//	
//	}
//	
		ArrayList<String> al = new ArrayList<String>();
		
		Student s1 = new Student(1,"A","A Address");
		Student s2 = new Student(2,"B", "B Address");
		Student s3 = new Student(3, "C", "C Address");
				
		ArrayList<Student> alStudent = new ArrayList<Student>();	
		
				alStudent.add(s1);
				alStudent.add(s2);
				alStudent.add(s3);
				
				Iterator itr2 = alStudent.iterator();				
				
				while(itr2.hasNext())
				{
					Student st=(Student) itr2.next();
					System.out.println(st.rollno);
				}
				
				// Retain all method in the arraylist will retain all those values which are unique
		// remove all method will remove all commont member from both the list
	//arl.add(10, null);
	//System.out.println(arl.get(0));
	//List lst = new List<String>();	
}	
}

class Student
{
	int rollno;
	String name;
	String Address;
	
	Student(int rNo,String nM,String aDr)
	{
		this.rollno = rNo;
		this.name = nM;
		this.Address = aDr;
	}
}

