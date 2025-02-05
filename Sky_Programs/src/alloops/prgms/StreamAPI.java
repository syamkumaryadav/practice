package alloops.prgms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("aa","vca","Assd","balu","Appel");
		List<String> starts=names.stream().filter(name->name.toLowerCase().startsWith("a")||name.toLowerCase().startsWith("A")).collect(Collectors.toList());
		System.out.println(starts);
		

	}

}
