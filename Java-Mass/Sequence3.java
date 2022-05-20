/* program to compute the sums for the first n terms
 sum = 2+4+6+....  */
 import java.util.Scanner;
 public class Sequence3 {
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         scan.close();
         int start=2;
         int total=0;
         for(int i=1;i<=n;i++){
             total+=start;
             start+=2;
         }
         System.out.println(total);
     }
 }
 