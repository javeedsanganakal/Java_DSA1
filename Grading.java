public class Grading{
    public static void main(String[] args) {

        // Grading scn = new Grading(System.in);
        // int marks = scn.nextInt();
        int marks = 81 ;
        // Write your code here
        if(marks>90){
          System.out.println("excellent");
        }
        else if(80<marks && marks<=90){
          System.out.println("good");
        }
        else if(70<marks && marks<=80){
          System.out.println("fair");
        }
        else if(60<marks && marks<=70){
          System.out.println("meets expectations");
        }
        else{
          System.out.println("below par");
        }
    
      }
}
