package Array.prgms;

public class HighestNo_ItsIndex {

	public static void main(String[] args) {
		int arr[]= {1,2,34,54,63,99,34,65,78};
		int maxElement=arr[0],maxIndex=0;
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]>maxElement) {
				maxElement=arr[a];
				maxIndex=a;
			}
		}
		System.out.println("maxElement :"+maxElement);
		System.out.println("maxIndex :"+maxIndex);

	}

}
