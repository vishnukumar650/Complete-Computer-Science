
/* Write a program that makes the following exchanges
    a-->b-->c-->a  */
import java.util.Scanner;

public class Swap3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        int temp;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();
        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("Values after Swapping are : " + a + " " + b + " " + c);
    }
}
