/*
Brandon Coles Project Euler
PROBLEM #: 1
DATE: 05/20/15
DESCRIPTION: Find the sum of multiples of 3 or 5 less than 1000
SOLUTION: 233168
 */
package p1;

public class P1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1;i<1000; i++){
            if(i%3==0 || i%5==0)
                sum+=i ;
        }
        System.out.println("The sum of multiples of 3 or 5 below 100 is: "+sum);
    }
}
