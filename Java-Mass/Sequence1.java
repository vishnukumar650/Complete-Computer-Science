/* program to compute the sums for the first n terms
 sum = 1+2+3+....  */
import java.util.Scanner;
public class Sequence1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
