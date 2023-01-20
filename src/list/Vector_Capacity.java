package list;
//import java.util.*;
import java.util.Vector;
public class Vector_Capacity {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());//before adding (default capacity=10)
		for(int i=1; i<=10; i++) {//to add 1-10 elements
			v.addElement(i);//to add i=i+1;
		}
		System.out.println(v.capacity());//capacity after adding 10 elements
		v.addElement('A');//add 11th element
		System.out.println(v.capacity());//2*10=20 doubly
		System.out.println(v);//print entire collection
	}
}
