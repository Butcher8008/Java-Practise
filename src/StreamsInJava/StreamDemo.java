package StreamsInJava;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list= List.of("osama","areesha begam", "awais","rimsha");
		for(String s:list) {
			System.out.println(s);
		}
		list.forEach(s->System.out.println(s));
		list.forEach(System.out::println);
		Stream<String> stream= list.stream();
		stream.forEachOrdered(System.out::println);
		Set<String> set=new HashSet<String>(list);
		Stream<String> stream2= set.stream();
		stream2.forEachOrdered(System.out::println);
	}

}
