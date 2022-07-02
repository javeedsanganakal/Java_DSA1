package GettingStarted;
import java.util.Scanner;

public class GCDLCD {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int tempNum1 = num1;
        int tempNum2 = num2;
        
        while(num1 % num2 != 0){
            int rem = num1%num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;
        int lcd = (tempNum1*tempNum2)/gcd;
        System.out.println(gcd);
        System.out.println(lcd);
    }
}
