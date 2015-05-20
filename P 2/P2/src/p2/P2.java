/*
Brandon Coles Project Euler
PROBLEM #: 2
DATE: 05/20/15
DESCRIPTION: The sum of even fibonacci numbers less than 4 000 000
SOLUTION: 4 913 732
 */
package p2;

public class P2 {

    public static void main(String[] args) {
        long sum = 0 ;
        long first = 1, second = 2, temp;
        while(second < 4000000){
            if(second % 2 == 0)
                sum += second ;
            temp = second;
            second += first ;
            first = temp ;
        }
        System.out.println("The sum of even fibonacci numbers ") ;
        System.out.println("less than 4 000 000 is " + sum);
    }
    
}
