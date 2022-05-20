
import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int result=1;
        for(int i=0;i<3;i++)
            result*=n;
        System.out.println("Cube of "+n+" is "+result);
    }
}
    

