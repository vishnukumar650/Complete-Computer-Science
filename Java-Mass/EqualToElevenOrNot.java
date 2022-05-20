import java.util.Scanner;
public class EqualToElevenOrNot{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        if(n==11)
            System.out.println("Yes, the number you entered is Eleven");
        else    
            System.out.println("No, the number you entered is not Eleven");
    }
}