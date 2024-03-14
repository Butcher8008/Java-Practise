package List;

import java.util.LinkedList;

public class GenericLinkList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add(0,"osama");
		list.add(1,"awais");
		list.add(2,"baloch");
		list.add(3,"areesha");
		for(String s: list) {
			System.out.println(s);
		}
	}

}
