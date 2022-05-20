import java.util.Scanner;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the array : "+sum);
    }
}
