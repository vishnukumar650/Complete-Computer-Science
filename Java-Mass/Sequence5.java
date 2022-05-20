// Program that prints out n values of the sequence
// 1 -1 1 -1 1 -1 ...
import java.util.Scanner;
public class Sequence5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int j=1;
        for(int i=1;i<=n;i++){
            if(j%2==0)
                System.out.print(-1+" ");
            else   
                System.out.print(1+" ");
            j++;
        }
    }
}
