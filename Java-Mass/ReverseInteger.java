import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int rev=0;
        while(n/10!=0){
            rev+=n%10;
            n=n/10;
            rev*=10;
        }
        rev+=n%10;
        System.out.println(rev);
    }
}
