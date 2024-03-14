package Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		set.add("osama");
		set.add("osama");
		set.add("osama");
		set.add("osama");
		set.add("osama");
		System.out.println(set);
		
		TreeSet sort=new TreeSet();
		sort.add(1);
		sort.add(2);
		sort.add(3);
		sort.add(4);
		sort.add(5);
		sort.add(6);
		sort.add(7);
		sort.add(8);
		sort.add(9);
		sort.add(1);
		System.out.println(sort);
		System.out.println(sort.descendingSet());
	}

}
