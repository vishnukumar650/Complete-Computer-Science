import java.util.Scanner;
import java.util.Scanner;
public class BasicSearch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]={54,33,21,87,96,5,6,43,991,876,345,235,456};
        int n=scan.nextInt();
        scan.close();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element is found");
                return;
            }
            
        }
        System.out.println("Element is not found");
    }
}
