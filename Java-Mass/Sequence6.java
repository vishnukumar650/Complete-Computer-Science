// Program to compute the sum of the first n terms (n>=1) of the series
// s = 1-3+5-7+9-.......
import java.util.Scanner; 
public class Sequence6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt(); 
        scan.close();
        int j=1;
        int total=0;
        int k=1;
        for(int i=1;i<=n;i++){
            if(j%2==0){
                total+=k;
            }
            else{
                total+=-k;
            }
            k+=2;
            j++;
        }
        System.out.println(total);
    }
}
//pending