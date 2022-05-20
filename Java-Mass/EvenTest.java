import java.util.Scanner;
public class EvenTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        if(n%2==0)
            System.out.println(n+" is an Even Number");
        else
            System.out.println(n+" is Not an Even Number");
    }
}
