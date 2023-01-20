package set;

import java.util.TreeSet;

public class TreeSet_Practice1 {

	public static void main(String[] args) {
	TreeSet t = new TreeSet();	
	t.add(100);
	t.add(100);
	t.add(500);
	t.add(300);
	t.add(200);
	//t.add(null);null pointer exception
	System.out.println(t);
	}

}
