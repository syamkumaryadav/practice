package StringHandling.prgms;

public class Upper_To_LowerCase {

	public static void main(String[] args) {
		String str="BALAYYA";	//65,97
		char[] array=str.toCharArray();
		for(int a=0;a<array.length;a++) {
			if(array[a]>='A' && array[a]<='Z') {
				array[a]=(char) (array[a]+32);
			}
		}
		String Lower=new String(array);
		System.out.println(Lower);
	}

}
