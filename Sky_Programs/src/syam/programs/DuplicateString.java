package syam.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<>();
			list.add("aa");
			list.add("bb");
			list.add("cc");
			list.add("aa");
			list.add("cc");
			list.add("dd");

			Set<String> uniqueString = new HashSet<>();
			Set<String> duplicateString = new HashSet<>();

			for (String str : list) {
				if (!uniqueString.add(str)) {
					duplicateString.add(str);
				}
			}
			System.out.println("duplicate strings are ::" + duplicateString);
			System.out.println("unique strings are ::" + uniqueString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}














