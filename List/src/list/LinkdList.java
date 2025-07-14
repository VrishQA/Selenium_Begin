package list;

import java.util.LinkedList;

public class LinkdList {

	public static void main(String[] args) {
		LinkedList<Integer> x= new LinkedList<> ();
		LinkedList<Integer> y= new LinkedList<> ();
		
		
		y.add(5);
		y.add(15);
		y.add(25);
		y.add(5);
		y.add(35);
		x.addFirst (10);
		x.add(1);
		x.add(1,5);
		System.out.println(x);
		x.addAll(y);
		System.out.println(x);
		
		
		
		
	}

}
