package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		//declare an arraylist
//ArrayList al=new ArrayList();
//		al.add(9);
//		al.add(9.0);
//		al.add('a');
//		al.add("string");
//		al.add(true);
//		System.out.println(al);
	//to store particular data
//		ArrayList<Character> al=new ArrayList<Character>();
//		al.add('a');
//		al.add('d');
//		al.add('b');
//		al.add('c');
//		//another way
//		List al=new ArrayList();
//		al.add(9);
//		al.add(8.0);
//		al.add("gdh");
//		System.out.println(al);
		//to get size of arraylist
		//System.out.println(al.size());
		//to remove element by index
	//	al.remove(1);
		//to remove element by element
		//al.remove("string");
		//to add element in particular location
		//al.add(3,"string");
		//System.out.println(al);
		//to retrive a specific element
		//System.out.println(al.get(2));
		//to  update the value
//		al.set(2,"python");
//		System.out.println(al);
//		//to check for value
//		System.out.println(al.contains("python"));
//		to check for arraylist is empty or not
		//System.out.println(al.isEmpty());
		
//		ArrayList al_dup=new ArrayList();
//		al_dup.addAll(al);
//		System.out.println(al_dup);
//		al_dup.removeAll(al);
//		System.out.println(al_dup);
		//Collections.sort(al);
		//System.out.println(al);
		//Collections.sort(al,Collections.reverseOrder());
		//Collections.shuffle(al);
		//System.out.println(al);
		int[] arr= {1,2,3,4};
		for(int value:arr)
		{
			System.out.println(value);
		}
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
