import java.util.*;
  
  public class Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
       // write ur code here

       int t = scn.nextInt();
       for(int i=0; i<t;  i++)
       {
         int n = scn.nextInt();

         boolean isPrime = false;

         for(int div= 2; div<n; div++) 
         {
            if(n%div == 0)
            {
              isPrime = true;
            }
         }
         if(isPrime == false){
           System.out.println("prime");
         }
         else{
           System.out.println("not prime");
         }
         
              
       }
   }
  }