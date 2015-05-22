/*
Brandon Coles Project Euler
PROBLEM #: 4
DATE: 05/22/15
DESCRIPTION:Find largest palindrome of the products of two three digit numbers
SOLUTION: 924 x 962 = 906609
*/
package p4;

public class P4 {
    public static void main(String[] args) {
        int iProduct ;
        int maxProduct = 0, num1=0, num2=0 ;
        for (int i =900; i < 1000; i++){
            for (int j=i; j<1000; j++){
              if (isPalindrome(i*j)){
                  System.out.println(i+" x "+j+" = "+ i*j);
                  if (i*j > maxProduct){maxProduct=i*j ;num1 = i;num2 = j;}
              }
            }
        }
        System.out.println("The highest number palindrome of 2 3 digit");
        System.out.println("numbers is "+num1+" x "+num2+" = "+ maxProduct);
    } 
    
    public static boolean isPalindrome(int num){
        int reversedNum = reverseNum(num) ;
        if (reversedNum == num)
            return true;
        return false;
    }
    public static int reverseNum(int num){
        int reversedNum=0;
        int length = numLength(num) ;
        for (int i = length-1; i >= 0;i--){
            reversedNum += num%10 * Math.pow(10,i) ;
            num /= 10 ;
        }
        return reversedNum;
    }
    
    public static int numLength(int num){
        int length = 0 ;
        while(num >= 1){num/=10 ; length++ ;}
        return length ;
    }
}
