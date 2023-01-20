package set;

import java.util.HashSet;

public class HashSet_Practice1 {

	final public static void main(String[] args) {
	HashSet h = new HashSet();
	h.add(100);
	h.add("Pune");
	h.add(100);
	h.add(null);
	h.add(null);
	System.out.println(h);
	System.out.println(h.size());
	System.out.println(h.isEmpty());
	System.out.println(h.contains(null));
	}

}
