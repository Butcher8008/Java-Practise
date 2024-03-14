package List;

import java.util.Iterator;
import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
		LinkedList<Object> link= new LinkedList<Object>();
		link.add(2);
		link.add("osama");
		link.add("is");
		link.add("Don");
		link.add(8);
		link.add(0);
		link.add(0);
		link.add(8);
		link.addFirst("im");
		link.addLast("don bhai");
		System.out.println(link);
		Iterator<Object> iterator = link.iterator();
	       while (iterator.hasNext()) {
			Object type = iterator.next();
			System.out.println(type);
			
		}
	}

}
