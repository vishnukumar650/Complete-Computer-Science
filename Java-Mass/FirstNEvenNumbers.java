import java.util.Scanner;
import java.util.Scanner;
public class FirstNEvenNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int start=2;
        scan.close();
        for(int i=1;i<=n;i++){
            System.out.print(start+" ");
            start+=2;
        }
    }
}
