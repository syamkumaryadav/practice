package sorts;

import java.util.Arrays;

public class BubbelSort {

	public static void main(String[] args) {

		int arr[] = { 14, 33, 27, 35, 10, 3 };

		for (int a = 0; a < arr.length-1; a++) {
			for (int b = 0; b < arr.length-1; b++) {
				int temp;
				if (arr[b] > arr[b + 1]) {
					temp=arr[b];
					arr[b] = arr[b + 1];
					arr[b+1]=temp;
					
				}

			}
		}
		String stringArray = Arrays.toString(arr);
		System.out.println(stringArray);
	}

}
