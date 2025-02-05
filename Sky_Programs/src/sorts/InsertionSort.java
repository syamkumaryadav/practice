package sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 44, 33, 27, 35, 10, 3 };

		for (int a = 1; a < arr.length; a++) {
			int key=arr[a]; // Store the current element
			int b;
			for(b=a-1;b>=0 && arr[b]>key;b--) {
				arr[b+1]=arr[b]; // Shift elements to the right
			}
			arr[b+1]=key;// Insert key at the correct position
		}
		String stringArray = Arrays.toString(arr);
		System.out.println(stringArray);

		
		

        // Printing the sorted array
        System.out.println(Arrays.toString(arr));
	}

}
