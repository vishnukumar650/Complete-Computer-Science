/* Write a program that makes the following changes
   a<--b<--c<--d<--a   */
import java.util.Scanner;
public class Swap4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c,d;int temp;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
        temp=a;
        a=b;
        b=c;
        c=d;
        d=temp;
        System.out.println("Values of variables after swapping : "+a+" "+b+" "+c+" "+d);
    }
}
