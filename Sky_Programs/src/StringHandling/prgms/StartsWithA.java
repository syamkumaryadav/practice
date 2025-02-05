package StringHandling.prgms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithA {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Apple", "ant", "ball", "cat", "doll","ddd","ggg","dgg");
		List<String> starts = names.stream().filter(name -> name.toLowerCase().startsWith("d") ||  name.toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
		System.out.println(starts);

	}

}
