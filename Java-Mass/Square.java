import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int result=n*n;
        System.out.println("Square of "+n+" is "+result);
    }
}
