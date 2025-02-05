package numbers;

public class Febnoci {

	public static void main(String[] args) {
		int first=0,next=1,last;
		for(int a=0;a<=10;a++) {
			System.out.print(first+" ");
			last=first+next;
			first=next;
			next=last;
		}
		/*int num=10,count=0;
		for(int a=2;a<=num/2;a++) {
			if(num%a==0)
				count++;
		}
		if(count==0) {
			System.out.println(num +" is a primr number....");
		}
		else {
			System.out.println(num +" is not a primr number....");
		}*/
		
		/*int num =100, count=0;
		for(int a=1;a<=num;a++) {
			for(int b=2;b<a;b++) {
				if(a%b==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(a +" ");
			}else {
				count=0;
			}
		}*/
		
		/*String str="syam",revStr="";
		int len=str.length();
		for(int a=0;a<=len-1;a++) {
			revStr=str.charAt(a)+revStr;
		}
		System.out.println(revStr);*/
	}

}
