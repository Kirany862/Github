package list;
import java.util.Iterator;
import java.util.LinkedList;
public class Linked_List {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(100);
		ll.add("Randy");
		ll.add(null);
		ll.add(null);
		ll.add('N');
		/*System.out.println(ll);
		System.out.println(ll.contains(null));
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(2));
		ll.add(1,500);
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);*/
		
		System.out.println("Print data using Iterator");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
