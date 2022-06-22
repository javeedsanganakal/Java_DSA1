import java.util.*;
public class Input {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        //int  n = scn.nextInt();
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();

      

        System.out.println("Hello : -> "+name);
        for(int i =0;  i< n; i++){
             System.out.println(i);
        }  
      
    }
}