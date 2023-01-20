package set;

import java.util.LinkedHashSet;

public class Linked_HashSet_Practice1 {

	public static void main(String[] args) {
	LinkedHashSet lh = new LinkedHashSet();
	lh.add(100);
	lh.add(100);
	lh.add('k');
	lh.add(null);
	lh.add(null);
	lh.add("pune");
	System.out.println(lh);
	System.out.println(lh.isEmpty());
	System.out.println(lh.size());
	System.out.println(lh.contains("pune"));
	}

}
