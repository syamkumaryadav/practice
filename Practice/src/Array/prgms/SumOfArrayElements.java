package Array.prgms;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] array = { 22, 32, 45, 63, 79 };
		int sum = 0;
		for (int a = 0; a < array.length; a++) {
			sum += array[a];
		}
		System.out.println(sum);

	}

}
