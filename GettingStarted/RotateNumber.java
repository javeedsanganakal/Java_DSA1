package GettingStarted;

import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        
       // write your code here  
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
  


    
    int count =0;
    int temp = n;
    while(temp>0){
        temp=temp/10;
      count++;
    }
    //My Solution
    // System.out.println(count);
    // if(k<0){
    //     k = k + count;
    // }
    // for(int i = 1; i <= k; i++){
    //   int q = n/10;
    //   int rem = n%10;
    //   n = (rem)*((int)Math.pow(10,count-1)) + q;
    // }
    // System.out.println(n);

    k = k%count;

    System.out.println(k);
     if(k<0){
        k = k + count;
    }

    int div=1;
    int multi = 1;
    for(int i=1;i<=count;i++){
        if(i<=k){
            div = div * 10;
        }
        else{
            multi = multi*10;
        }
    }
    
    int q = n/div;
    int r = n%div;
    int res = r * multi + q;
    System.out.println(res);


       }
}
