package set;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Linked_HashSet {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Vikrant");
		lhs.add(1000);
		lhs.add('H');
		lhs.add(null);
		//insertion maintained
		//no dafault capacity
		/*System.out.println("DS: linear+Hashtable");
		System.out.println(lhs);
		lhs.add(null);
		//best choice: remove duplicates when order of insertion is mandatory
		lhs.remove(3);
		lhs.remove(2);
		System.out.println(lhs);*/
		
		System.out.println("print data using iterator");
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
