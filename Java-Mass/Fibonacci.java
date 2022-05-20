import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int temp1=1;
        int temp2=1;
        if(n>=1)
        {
            System.out.print(temp1+" ");
            if(n==1)
                return;
        }
        if(n>=2)
        {
            System.err.print(temp2+" ");
            if(n==2)
                return;
        }
        for(int i=2;i<n;i++){
            int total=temp1+temp2;
            System.out.print(total+" ");
            temp2=temp1;
            temp1=total;

        }
    }
}