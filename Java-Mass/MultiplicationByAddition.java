// program to simulate multiplication by addition
import java.util.Scanner;
public class MultiplicationByAddition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m1=scan.nextInt();
        int m2=scan.nextInt();
        int result=0;
        for(int i=1;i<=m2;i++){
            result+=m1;
        }
        System.out.println(result);
    }
}
