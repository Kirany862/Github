package list;
import java.util.Iterator;
import java.util.Vector;
public class Vector_Class {

	public static void main(String... args) {
		Vector v = new Vector();
		v.add(500);
		v.add("Ray");
		v.add('Z');
		v.add(null);
		v.add(null);
		/*System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.contains("Kiran"));
		System.out.println(v.isEmpty());
		System.out.println(v.get(1));
		System.out.println(v.indexOf('Z'));
		v.add(0,"Henry");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);*/
		
		System.out.println("Print data in class using Irerator cursor");
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
			//using for each loop
			/*for(Object o:v) {
				System.out.println(o);*/
			}
		}
}
		


