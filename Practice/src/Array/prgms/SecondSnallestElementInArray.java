package Array.prgms;

public class SecondSnallestElementInArray {

	public static void main(String[] args) {
		int[] array= {11,85,34,65,67,84,7};	// here if 1st elements is lessthan to remaining elements output not come,
		int smallestNo=50,secondSmallestNo=50;	// the smallest elemente is in last than its working 
		for(int c=0;c<array.length;c++)
		{
			if(smallestNo>array[c])		
			{
				secondSmallestNo=smallestNo;
				smallestNo=array[c];
				if(secondSmallestNo>smallestNo && array[c] != smallestNo )
				{
					secondSmallestNo=array[c];
				}
				
			}
			
		}
		System.out.println("Smallest number in array : "+smallestNo);
		System.out.println("secondSmallestNo number in array : "+secondSmallestNo);
	}
		/*for(int num :array) {
			if(num<smallestNo) {
				secondSmallestNo=smallestNo;
				smallestNo=num;
			}else if(secondSmallestNo>smallestNo&&secondSmallestNo!=smallestNo) {
				secondSmallestNo=num;
			}
		}
		
		/*
		 int[] arr = {5, 2, 9, 1, 7};

	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int num : arr) {
	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num < secondSmallest && num != smallest) {
	                secondSmallest = num;
	            }
	        }

	        if (secondSmallest == Integer.MAX_VALUE) {
	            System.out.println("No second smallest element found.");
	        } else {
	            System.out.println("Second smallest element: " + secondSmallest);
	        }
	    }*/

	}


