package syam.programs;

import java.util.Arrays;
import java.util.List;

public class ListToArray_Convertion_by_joinMethod {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "cherry");
        String result = String.join(", ", list);
        System.out.println(result);
	}

}
