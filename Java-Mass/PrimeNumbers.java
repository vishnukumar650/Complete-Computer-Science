// Prime Numbers Till the Number
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int factors=0;
        scan.close();
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    factors++;
                }
            }
            if(factors<3)
                System.out.print(i+" ");
            factors=0;
        }
    }
}
