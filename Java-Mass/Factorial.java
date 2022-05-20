import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int result=1;
        if(n==1||n==0)
        {
            System.out.println("Factorial of "+n+" is "+result);
            return;
        }
        for(int i=2;i<=n;i++)   
            result*=i;
        System.out.println("Factorial of "+n+" is "+result);
    }
}
