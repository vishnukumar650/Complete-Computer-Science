import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[]={8,7,2,5,3,1};
        int s=scan.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==s){
                    System.out.println("Pair found "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
