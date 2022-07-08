package Patterns;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        int n = scn.nextInt();
        int numOfStars=1;
        int numOfSpaces=n-1;

        for(int i =1; i<=n; i++){
            
            for(int j=1; j<=numOfSpaces; j++){
                System.out.print("\t");
                
            }      
            for(int j =1; j<= numOfStars; j++){
                System.out.print("*\t");
            }
            numOfStars ++;
            numOfSpaces--;
            System.out.println();
        }

    }
}