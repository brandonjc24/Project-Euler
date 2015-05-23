/*
Brandon Coles Project Euler
PROBLEM #: 12
DATE: 05/22/15
DESCRIPTION:What is the value of the first triangle number to have over five hundred divisors?
SOLUTION: 76576500
*/

package p12;

public class P12 {
    public static void main(String[] args) {
        int triNumber = 0, dNum ;
        for ( int i = 1; ; i++){
            triNumber += i ;
            System.out.println("Num: "+ triNumber);
            dNum = numDivisors(triNumber) ;
            if (dNum >= 500) {break ;}
        }
        System.out.println("The number with "+ dNum + " divisors is "+triNumber);
    }
    
    public static int numDivisors(int num){
        int count = 0 ; // include 1 and num in the count
        //System.out.print(num+" : ");
        int sqrtNum = (int)Math.sqrt(num);
        for (int i = 1;i <= sqrtNum; i++){
            if (num%i==0) {count+=2 ;/*System.out.print(" "+i);*/}
        }
        //System.out.println(" count : " +count);
        return count ;
    }
    
}
