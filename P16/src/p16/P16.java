/*
Brandon Coles Project Euler
PROBLEM #: 16
DATE: 05/25/15
DESCRIPTION: What is the sum of the digits of the number 2^1000?
SOLUTION:   The sum of all the digits
            of 2^1000 is 1366
*/
package p16;

import java.math.BigInteger;

public class P16 {

    public static void main(String[] args) {
        int sum = 0 ;
        BigInteger num = BigInteger.valueOf(2) ;
        
        for (int i = 2 ; i <= 1000; i++)
            num = num.multiply(BigInteger.valueOf(2));
        
        String stringNum = num.toString() ;
        int len = stringNum.length() ;
        
        for( int i = 0; i < len; i++)
            sum += ( ( (int) stringNum.charAt(i) ) - 48 );
        
        System.out.println("The sum of all the digits") ;
        System.out.println("of 2^1000 is "+ sum) ;
    }
}
