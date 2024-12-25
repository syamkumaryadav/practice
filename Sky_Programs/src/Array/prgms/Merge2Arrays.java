package Array.prgms;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		/*int[] array = { 2, 3, 4, 5, 6 };
		int[] array2 = { 2, 3, 4, 5, 6 };*/
		
		ArrayList<Integer> arr1 =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> arr2 =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		arr1.addAll(arr2);
		System.out.println(arr1);
		
		
		for(int s:arr2) {
			arr1.add(s);
		}
		System.out.println("aaaaaaaaaaaaaaaa : "+arr1);

	}

}
