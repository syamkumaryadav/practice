package StringHandling.prgms;

public class Lower_To_Upper_case {

	public static void main(String[] args) {
		String str = "syam";//97-65---------------.97-32
		char[] charArr = str.toCharArray();
		for (int a = 0; a < charArr.length; a++) {
			if (charArr[a] >= 'a' && charArr[a] <= 'z') {
				charArr[a] = (char) (charArr[a] - 32);
			}
		}
		String upperCase = new String(charArr);
		System.out.println(upperCase);
	}

}
