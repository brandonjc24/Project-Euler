/*
Brandon Coles Project Euler
PROBLEM #: 14
DATE: 05/23/15
DESCRIPTION:The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?
SOLUTION:   The number that produces the longest chain of
            525 numbers is 837799
*/
package p14;

public class P14 {

    public static void main(String[] args) {
        long maxChain = 0, currentChain;
        long maxNum =0, n;
        
        for (int i = 3; i < 1000000 ; i++){
            n = i ;
            currentChain = 1 ;
            while (n > 1){
                n = (n%2==0) ? (n/2) : (3*n+1) ;
                currentChain++;
            }
            if(currentChain > maxChain) { maxChain = currentChain ; maxNum = i; }
        }
        
        System.out.println("The number that produces the longest chain of") ;
        System.out.println(maxChain + " numbers is " + maxNum);
        
    }  
}
