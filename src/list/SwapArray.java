package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapArray {

	public static void main(String[] args) {
		List list=Arrays.asList(10,20,30,40,50);
		Collections.swap(list, 2, 4);
		System.out.println(list);
	}

}
