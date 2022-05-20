import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int factorsCount = 0;
        if(n<=1){
            System.out.println("Invalid");
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                factorsCount++;
            }
        }
        if(factorsCount==0)
            System.out.println(n+" is a Prime Number");
        else
            System.out.println(n+" is a Composite Number");
    }    
}
