package Map;

import java.util.HashMap;
import java.util.Set;

public class MapPractise {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Mouse", 200);
		map.put("CPU", 10000);
		map.put("LED", 10000000);
		Set<String> key=map.keySet();
		for(String k:key) {
			System.out.println(k+":"+map.get(key));
		}

	}

}
