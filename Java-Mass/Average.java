import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        float total=0;
        for(int i=0;i<n;i++){
            total+=scan.nextInt();
        }
        scan.close();
        float avg=total/n;
        System.out.println(avg);
    }
}
