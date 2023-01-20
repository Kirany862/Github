package set;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet_Class {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(300);
		ts.add(700);
		ts.add(200);
		ts.add(100);
		ts.add(300);
		//remove duplicates whenever data is in ascending order
		//System.out.println(ts);//print entire data
		
		System.out.println("print data using iterator");
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
