// Swapping of two numbers
import java.util.Scanner;
public class Swap1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber=scan.nextInt();
        int secondNumber=scan.nextInt();
        int temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println("Swapped Values of First Number and Second Number are Respectively "+firstNumber+" "+secondNumber);
    }    
}
