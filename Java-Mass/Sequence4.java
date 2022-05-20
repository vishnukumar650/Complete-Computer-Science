/* program to compute the sums for the first n terms
 sum = 1/1 + 1/2 + 1/3 + 1/4 + 1/5 +....  */
import java.util.Scanner;
public class Sequence4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        float total=0;
        for(int i=1;i<=n;i++){
            total=total+(float)(1.0/(float)i);
        }
        System.out.println(total);
    }
}
