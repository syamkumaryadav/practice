package syam.programs;

import java.math.BigInteger;

public class ToStoreBigNumber10000 {
    public static void main(String[] args) {
        BigInteger bigNumber = new BigInteger("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println(bigNumber);
        
        
        System.out.println(bigNumber.bitLength());		// method returns the number of bits required to represent the value of the BigInteger in binary. It essentially measures the size of the number.
        
        
        System.out.println("Number of digits: " + bigNumber.toString().length());	 // for count number digits in number
    }
}
