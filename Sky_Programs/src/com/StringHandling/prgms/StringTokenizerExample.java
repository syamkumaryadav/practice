package com.StringHandling.prgms;
import java.util.*;

public class StringTokenizerExample {		//This class is considered legacy; now, it's more common to use split() method of the String class or Scanner.

    public static void main(String[] args) {
        String s = "Gokada syam kumar . . . .";
        StringTokenizer st = new StringTokenizer(s); 
        int n = st.countTokens(); 
        System.out.println(n);  								 //7
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());
        }
    }
}

