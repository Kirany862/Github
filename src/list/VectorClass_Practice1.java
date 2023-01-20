package list;

import java.util.Vector;

public class VectorClass_Practice1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add('V');
		v.add(null);
		v.add(null);
		v.add("Pune");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf(null));
		System.out.println(v.get(4));
		System.out.println(v.contains(5));
	}

}
