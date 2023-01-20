package list;

import java.util.ArrayList;

public class ArrayList_Practice1 {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add('K');
	al.add(null);
	al.add(null);//allow any no of null values
	al.add("Kiran");
	al.add("Kiran");//duplicate is allowed
	//order of insertion maintained
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains('A'));
	System.out.println(al.get(2));
	}
}
