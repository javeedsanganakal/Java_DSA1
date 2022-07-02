package GettingStarted;
import java.util.*;
  public class Fibonacci{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          int first = 0;
          int second = 1;
          int fib;
          // int fib = first + second;
          // System.out.println(first);
          // System.out.println(second);
          for(int i  = 0; i<n; i++){
              System.out.println(first);
              fib = first + second;
              first= second;
              second = fib;
              
          }
     }
  }