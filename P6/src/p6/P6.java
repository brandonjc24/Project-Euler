/*
Brandon Coles Project Euler
PROBLEM #: 6
DATE: 05/22/15
DESCRIPTION:Find the difference between the sum of the squares of the 
            first one hundred natural numbers and the square of the sum.
SOLUTION: 25164150
*/
package p6;

public class P6 {
    public static void main(String[] args) {
        int sum_Of_Squares = 0 ;
        int square_Of_Sum = 0 ;
        for (int i = 1; i < 101; i++){
            sum_Of_Squares += i*i;
            square_Of_Sum += i ;
        }
        square_Of_Sum *= square_Of_Sum ;
        int difference = square_Of_Sum - sum_Of_Squares;
        
        System.out.println("The difference between the sum of squares and");
        System.out.println("the square of the sum is " + difference);
    }
}
