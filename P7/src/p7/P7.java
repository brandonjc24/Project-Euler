/*
Brandon Coles Project Euler
PROBLEM #: 7
DATE: 05/22/15
DESCRIPTION: Find the 10 001st prime number
SOLUTION: 104743
*/
package p7;

public class P7 {
    public static void main(String[] args) {
        int count = 1 ;
        int primeNum = 1;
        while(count <10001){
            primeNum+= 2;
            if(isPrime(primeNum)) count++ ;
        }
        System.out.println("The 10,0001st prime number is "+primeNum) ;
 }
    
    public static boolean isPrime( int num ){
        for (int i = 2; i <= ((int)Math.sqrt(num)) + 1 ; i++){
            if(num%i==0) return false;
        }
        return true;
    } 
}
