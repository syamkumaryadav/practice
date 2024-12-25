package alloops.prgms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class ClassA 
{
	void meth1()
	{
		System.out.println("Implementing set interface");
		LinkedHashSet<Object>set=new LinkedHashSet<Object>();
		set.add(10);
		set.add("Java");
		set.add(null);
		set.add(10);
		set.add('a');
		set.add(10.9);
		set.add(false);
		set.add(99);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println("Reterving the data by using Iterator Interface");
		Iterator<Object>i=set.iterator();
		while(i.hasNext());
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n\n Reterving the data by using ListIterator Interface");
		LinkedList<Object>ll=new LinkedList<Object>(set);
		ListIterator<Object>li=ll.listIterator(ll.size());
		while(li.hasPrevious());
		{
			System.out.print(li.previous()+" ");
		}
		ArrayList<Boolean>al=new ArrayList<Boolean>();
		al.add(true);
		al.add(true);
		al.add(true);
		HashSet<Boolean>set2=new HashSet<Boolean>(al);
		System.out.println("\n\n"+al+" "+al.size());
		System.out.println(set2+" "+set2.size());
	}
	public static void main (String[] args)
	{
		ClassA aobj=new ClassA();
		aobj.meth1();
	}
}