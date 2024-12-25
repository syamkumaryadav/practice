package Array.prgms;

public class BubbleSorting {

	public static void main(String[] args) {
		int arr[]= {67,9,0,7,6,3,1,35,8,96};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<(arr.length-i);j++) {
				if(arr[j-1]>arr[i]) {
					int t=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int x:arr) {
			System.out.println(x);
		}

	}

}
