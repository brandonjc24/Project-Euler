/*
Brandon Coles Project Euler
PROBLEM #: 15
DATE: 05/23/15
DESCRIPTION:Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?
SOLUTION:   The number of routes in a 20x20 grid
            is 137846528820
*/
package p15;

public class P15 {
    public static void main(String[] args) {
        int gridSize = 20 ;
        System.out.println("The number of routes in a "+gridSize+"x"+gridSize+" grid") ;
        System.out.println("is "+getRouteNum(gridSize+1));
    } 
    
    public static long getRouteNum(int num){
        long array[][] = new long[num][num] ;
        for (int i = 1; i < num; i++){
             array[0][i] = 1;
             array[i][0] = 1;
        }
        array[0][0] = 0 ;
        for (int i = 1; i < num; i++){
            for (int j = 1; j < num; j++)
                array[i][j] = array[i-1][j] + array[i][j-1];
        }
        return array[num-1][num-1] ;
    }   
}
