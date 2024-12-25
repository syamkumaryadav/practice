package com.syam.programs;

import java.util.ArrayList;
import java.util.List;

public class ListToArray_Convertion_by_toStringMethod {

	public static void main(String[] args) {
		List<String> li=new ArrayList();
		li.add("aa");
		li.add("bb");
		li.add("cc");
		
		for(String str :li) {
			System.out.println(str);
		}
		
		String array=li.toString();
		System.out.println(array);

	}

}
