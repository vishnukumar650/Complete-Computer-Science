
//Swapping of two integer numbers without using any temp variable
import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped Values are " + a + " " + b);
    }
}
