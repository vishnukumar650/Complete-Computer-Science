import java.util.Scanner;
public class FirstNOddNumbers {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int start=1;
        scan.close();
        for(int i=1;i<=n;i++){
            System.out.print(start+" ");
            start+=2;
        }
    }
}

