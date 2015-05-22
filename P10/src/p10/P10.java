/*
Brandon Coles Project Euler
PROBLEM #: 10
DATE: 05/22/15
DESCRIPTION: Find the sum of all the primes below two million.
SOLUTION: 142913828922
*/

package p10;

public class P10 {
    public static void main(String[] args) {
       
        int pPrime = 3;
        long sum = 2;
        
        while(pPrime<2000000){
            if(isPrime(pPrime)) 
                sum += pPrime ;
            pPrime+=2 ;
        }
        System.out.println("The sum of all primes below 2000000 is "+sum);
    }
    
    public static boolean isPrime( int num ){
        if(num%2==0) 
            return false;
        for (int i = 3; i <= ((int)Math.sqrt(num)) + 1 ; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
