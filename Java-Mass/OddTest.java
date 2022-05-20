import java.util.Scanner;
public class OddTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        if(n%2==1)
            System.out.println(n+" is an Odd Number");
        else
            System.out.println(n+" is Not an Odd Number");
    }
}
