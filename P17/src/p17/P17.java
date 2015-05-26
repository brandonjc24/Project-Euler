/*
 * Brandon Coles Project Euler
 * PROBLEM #: 17
 * DATE: 05/25/15
 * DESCRIPTION: If all the numbers from 1 to 1000 (one thousand)
                inclusive were written out in words, how many
                letters would be used?
 * SOLUTION:    The sum of all the letters in the numbers
                from 1 - 1000 is 21124
 */
package p17;

public class P17 {

    public static void main(String[] args) {
        
        int letters = 0, n, m;
        int currentLetter ;
        String hundredAnd = "hundredand" ;
        String hundred = "hundred" ;
        String oneLength[] = new String[]{"one", "two", "three", "four"
                    ,"five", "six", "seven", "eight", "nine"};
        
        String tenLength[] = new String[] {"twenty", "thirty", "fourty",
                    "fifty", "sixty", "seventy", "eighty", "ninty"};  
        
        String teenLength[] = new String[] {"ten", "eleven", "twelve",
                    "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                       "eighteen", "nineteen"};//10-19
        
        for (int i = 0; i < 9; i++)
            letters += oneLength[i].length() ;

        for( int i = 0; i < 10; i++)
             letters += teenLength[i].length() ;

        for (int i = 20; i < 1000 ; i++){
            currentLetter = 0 ;
            
            n = (i/10)%10 ; // get the xXx digit
            
            if (n != 1) {
                if (n>1)
                    currentLetter += tenLength[n-2].length() ;
                n = i%10 ;// get xxX digit
                if (n != 0) 
                    currentLetter += oneLength[n-1].length() ;
            }
            else if (n==1){
                currentLetter += teenLength[(i%10)].length() ;
            }
            
            if ( i > 99 )
            {
                n = i/100 ; // Xxx digit
                currentLetter += oneLength[n-1].length() ;
                if (i%100 == 0)
                    currentLetter += hundred.length() ;
                else
                    currentLetter += hundredAnd.length() ;
            }
            // System.out.println(i+" : length : "+currentLetter);
            letters+= currentLetter ;
        }     
        
        letters += 11 ; // adds 1000
        System.out.println("The sum of all the letters in the numbers") ;
        System.out.println("from 1 - 1000 is " + letters);
        
    }
}
