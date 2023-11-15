package Arraylist;

import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		//LinkedList <Integer> l=new LinkedList <Integer>();
		LinkedList l=new LinkedList();
		l.add(8);
		l.add(2.3);
		l.add("string");
		l.add('g');
		l.add(true);
		l.add(null);
		System.out.println(l);
		//in  
		//System.out.println(l.size());//6
		//l.remove(3);
		//System.out.println("after remove node from :"+l);
		//we cannot remove element from linkedlist by mentioning element
		//to add element in middle
		//l.add(2,"java");
		//System.out.println("after inserting element"+l);
		//retriving value or object
		//System.out.println(l.get(3));
		// change the value
		//l.set(5,false);
		//System.out.println(l);
		//check contains
		//System.out.println(l.contains("java"));
		//is empty
		//System.out.println(l.isEmpty());
		//to read elements 
//		for (int i = 0; i < l.size(); i++)
//		{
//		  System.out.print(l.get(i)+" ");	
//		}
//		for each loop
//		for (Object object : l)
//		{
//			System.out.println(object);
//			
//		}
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
      l.removeFirst();
      l.removeLast();
		System.out.println(l);
		
		
		
	}

}
