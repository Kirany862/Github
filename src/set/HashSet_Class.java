package set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet_Class {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10000);
		hs.add("Veer");
		hs.add(null);//allow only one null value
		hs.add('V');
		hs.add("Ray");
		hs.add('V');//duplicates are not allowed
		hs.add(null);
		/*System.out.println("No default capacity");
		System.out.println("Data structure Hashtable");
		System.out.println(hs);
		hs.add(500);//order of insertion is random
		System.out.println(hs.clone());//exact copy of an object
		hs.remove(2);//remove duplicates when order of insertion is not mandatory
		System.out.println(hs.size());
		System.out.println(hs);*/
		
		System.out.println("Print data using iterator");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
