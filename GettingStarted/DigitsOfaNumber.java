package GettingStarted;
import java.util.*;
public class DigitsOfaNumber {
    public static void main(String[] args) {
        // write your code here 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int count = 0;
        int temp = n;
        int q;
        while(temp != 0){
            temp = temp/10;
          count++;
        }
        while(count != 0){
            count--;
            int div  = (int)Math.pow(10,count);
            q = n/div;
            n =  n  - (q*div);
            
            System.out.println(q);
        }
       }
}
