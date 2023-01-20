package list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.ListIterator;
public class Array_List {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(100);
		al.add('A');
		al.add(null);
		al.add("Ratan");
		
		/*System.out.println(al);//print entire data
		System.out.println(al.size());//get the size
		System.out.println(al.isEmpty());//empty checking
		System.out.println(al.contains('A'));//containing data or not
		System.out.println(al.get(2));//get data from particular index*/
		
		//fetch data using iterator cursor(universal cursor)
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			//fetch data using list iterator
			/*ListIterator litr = al.listIterator();
			while(litr.hasNext()) {
				System.out.println(litr.next());*/
				
				//print data using for each loop
				//for(Object s:al) {
					//System.out.println(s);
				}
	}
}

