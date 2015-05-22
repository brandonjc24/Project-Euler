/*
Brandon Coles Project Euler
PROBLEM #: 9
DATE: 05/22/15
DESCRIPTION:There exists exactly one Pythagorean triplet for which a + b + c = 1000.
            Find the product abc.                               a<b<c, a^2+b^2=c^2
SOLUTION: 31875000
*/
package p9;

/* use a+b+c=1000 and a^2+b^2=c^2 to get a system with only 2 variables
    2000a + 2000b = 1000000 + 2ab
    solve this using a<b
    a = (500000 - 1000b)/( 1000 - b )
    a,b and c are integers, find when a is an intger and that will be
    the answer since their is exactly one solution
*/

public class P9 {
    public static void main(String[] args) {
        double tA ;
        int a=0, b=0;
        for (int tB = 2; tB < 998; tB++){ 
            tA = function(tB) ;             // 
            if (Math.floor(tA)==tA){ a=(int)tA; b=tB; break; } 
        }
        int c = 1000 - a - b; 
        int product = a*b*c ;
        System.out.println("The product of the pythagorean triplet is "+product) ;
    }
    
    public static double function(double num){
        return ( (500000-1000*num)/(1000-num) );
    }
}
