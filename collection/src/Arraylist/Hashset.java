package Arraylist;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		//HashSet hs=new HashSet(); //default capacity 16 load factor 0.75
		//HashSet hs=new HashSet(100);//initial capacity 100
		//HashSet hs=new HashSet(100,(float)0.90);
		//HashSet <Integer> hs=new HashSet<Integer>();
		//add objects/element into  hashset
		/*hs.add(100);
		hs.add("welcome");
		hs.add(100.0);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);*///insertion order not preserved
		// to remove
//		hs.remove('A');
//		System.out.println(hs);
//		// to check value contains or not
//		System.out.println(hs.contains("welcome"));
//		System.out.println(hs.isEmpty());
		//reading all elements by using for each loop
		//for (Object object : hs) {
		//	System.out.print(object+","+" ");
		//}
		//System.out.println();
		
			//using iterator
			//Iterator it=hs.iterator();
			//while(it.hasNext())
//			{
//				
//				System.out.print(it.next()+" ");
//	
//			}
//			hs.add(100);
//			hs.add(101);
//			hs.add(103);
//			hs.add(104);
//			hs.add(105);
//			System.out.println(hs);
			//HashSet <Integer> hs1=new HashSet<Integer>();
			
			//hs1.addAll(hs);
			//hs1.add(106);
			//System.out.println(hs1);
			//hs1.removeAll(hs);
			//System.out.println(hs1);
			//UNIONS
			HashSet <Integer> hs=new HashSet<Integer>();
			hs.add(100);
			hs.add(101);
			hs.add(103);
			hs.add(104);
			hs.add(105);
			System.out.println(hs);
			HashSet <Integer> hs1=new HashSet<Integer>();
			hs.add(103);
			hs.add(104);
			hs.add(105);
			hs.add(109);
			hs.add(110);
			System.out.println(hs1);
			//hs.addAll(hs1);
			//System.out.println("UNION: "+hs);
			
//			//INTERSECTION
//			hs.retainAll(hs1);
//			System.out.println("INTERSECTION: "+hs);
			//hs.removeAll(hs1);
			//System.out.println("differnce"+hs1);
			//SUBSET
			//hs.containsAll(hs1);
			//System.out.println("SUBSET: "+hs);
		}
		
	}

//}
