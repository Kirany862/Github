package list;

import java.util.LinkedList;

public class LinkedList_Practice1 {

	public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(200);
	ll.add('j');
	ll.add(null);
	ll.add(null);
	ll.add("Dec");
	ll.add("Dec");
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.contains('j'));
	System.out.println(ll.get(1));
	}

}
