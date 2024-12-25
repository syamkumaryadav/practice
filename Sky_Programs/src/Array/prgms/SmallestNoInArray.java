package Array.prgms;

public class SmallestNoInArray {

	public static void main(String[] args) {
		int[] array= {22,45,6,35,89};
										/*int[] arr= {};
										int[] a;	//	must be initialize like int[] a={};
										a=new int[6];	// like this also other wise shows error
										a[0]=1;
										a[2]=3;*/
		int a=10;
		for(int c=0;c<array.length;c++)
		{
			if(a<=array[c])		// if we want smallest number or Gratest number here >  < symbols can decide.
			{
				a=array[c];
			}
		}
		System.out.println("Smallest number in array : "+a);
	}

}
