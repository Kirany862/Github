package list;

import java.util.HashSet;
import java.util.List;

public class UniqueListChecker {
	public static boolean checkList(List<Integer> list) {
		HashSet<Integer> set = new HashSet<>();
		for(Integer integer: list) {
			if(set.contains(integer)) {
				return false;
			}
			else {
				set.add(integer);
			}
		}
		return true;
	}
	public static void main(String[] args) {
		List<Integer> list = List.of(5,10,15,20);
		boolean result = checkList(list);
		if(result) {
			System.out.println("All elements in the list are unique");
		}else {
			System.out.println("There are repeated elements in the list");
		}
	}
}
