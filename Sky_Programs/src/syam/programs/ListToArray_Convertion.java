package syam.programs;

import java.util.ArrayList;
import java.util.List;

public class ListToArray_Convertion {

	public static void main(String[] args) {
		List<String> li=new ArrayList();
		li.add("aa");
		li.add("bb");
		li.add("cc");
		
		for(String str :li) {
			System.out.println(str);
		}
		String[] array = new String[li.size()];
		int a=li.size();
		for(int b=0;b<a;b++)
		{
			array[b]=li.get(b);
			//System.out.println(array); 	// this for printing hash code...
		}
		// System.out.println("Array: " + Arrays.toString(array));
		System.out.print("Array: ");
        for (String str : array) {
            System.out.print(str + " ");
        }
;	}

}
