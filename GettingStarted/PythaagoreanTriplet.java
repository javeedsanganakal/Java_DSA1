package GettingStarted;
import java.util.*;
  public class PythaagoreanTriplet {
  
  	  public static void main(String[] args) {
  	  	//   Write your code here
			Scanner scn = new Scanner(System.in);
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();
			int larNum=0;


            // int max = a;
            // if(b>max){
            //     max = b;
            // }
            // if(c>max){
            //     max = c;
            // }


            if(a>b&&a>c){
                larNum = a;
            }
            else if(b > a && b > c){
                larNum = b;
            }
            else{
                larNum = c;
            }

			if(((a*a)+(b*b)) == (larNum*larNum)){
			  System.out.println(true);
			}
			else if ((b*b)+(c*c) == (larNum*larNum)){
				System.out.println(true);
			}
			else if ((c*c)+(a*a) == (larNum*larNum)){
				System.out.println(true);
			}
			else if ((a*a)+(b*b) == (larNum*larNum)){
				System.out.println(true);
			}
			else{
				System.out.println(false);
			}
  	  }
  }