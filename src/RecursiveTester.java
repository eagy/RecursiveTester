/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OTR2
 */
public class RecursiveTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(5));
        hanoi(5, 1, 3, 2);
    }
    
    public static int factorial(int n) {
        if (n == 0 )
            return 1; 
        else 
            return n * factorial(n-1);
    }
    
    public static void hanoi(int disk, int source, int dest, int spare) {
        if(disk == 1) {
            System.out.println("Move disk from " + source + " to " + dest);
        }
        else {
            hanoi(disk-1, source, spare, dest);
            System.out.println("Move disk from " + source + " to " + dest);
            hanoi(disk-1, spare, dest, source);
        }
    }
    
}
