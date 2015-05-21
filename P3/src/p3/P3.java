/*
Brandon Coles Project Euler
PROBLEM #: 3
DATE: 05/20/15
DESCRIPTION: largest prime factor of the number 600851475143
SOLUTION: 6857
 */

package p3;

import static java.lang.Math.sqrt;

public class P3 {

    public static void main(String[] args) {
        //long num = 20;
        long num = 600851475143l;
        long max = 0 ;
        long highest = (long) sqrt(num) +1 ;
        System.out.println(highest);
        for(int i = 3; i<=highest ;i+=2)
        {
            if(num%i == 0)
            {
                if(isPrime(i)) 
                    max = i ;
            }
        }
        
        System.out.println("The maximum prime factor of ");
        System.out.println("600851475143 is "+ max) ;
    }  
    
    public static boolean isPrime(long num)
    {
        long highest = (long) sqrt(num) ;
        for(int i = 2; i < highest;i++)
        {
            if(num%i == 0)
                return false ;
        }
        return true ;
    }
}
