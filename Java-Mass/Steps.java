import java.util.Scanner;
public class Steps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps=scan.nextInt();
        scan.close();
        for(int i=0;i<steps;i++){
            for(int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
