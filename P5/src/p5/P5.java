/*
Brandon Coles Project Euler
PROBLEM #: 5
DATE: 05/22/15
DESCRIPTION: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
SOLUTION: 232792560
*/
package p5;

public class P5 {
    public static void main(String[] args) {
        int num = smallEven() ;
        System.out.println("The smallest number that is evenly divisible");
        System.out.println("by the numbers from 1 to 20 is "+ num);
    } 
    
    public static int smallEven(){
        int array[] = new int[11] ;
        
        array[0] = 7;                    // only need to check 7, 11-20
        for (int j = 11; j < 21 ; j++)   // other numbers are factors of those
            array[j-10] = j ;
        
        for (int i = 40;;i+=5){
            for (int index = 0; isDivisible(i,array[index])&& index<11 ; index++){
                if (index==10) return i;
            }
        }
    }
    
    public static boolean isDivisible(int num, int denom){
        return (num%denom==0) ;
    }
}
