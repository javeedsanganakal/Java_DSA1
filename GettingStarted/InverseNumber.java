package GettingStarted;
import java.util.Scanner;
public class InverseNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        int base = 1;
        while(n!=0){
            int digit =  n%10;
            n = n/10;    
            sum = sum + (base*((int)Math.pow(10, digit-1)));
            base ++;
        }
        System.out.println(sum);
    }
}


// int res = 0;
//         int pos = 1;
//         while (n > 0) {
//             int digit = n % 10;
//             n = n / 10;
//             res += pos * Math.pow(10, digit-1);
//             pos++;
//         }







