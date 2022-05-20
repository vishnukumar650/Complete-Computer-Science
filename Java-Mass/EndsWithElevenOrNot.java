import java.util.Scanner;
public class EndsWithElevenOrNot {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        if(n>=11){
            if(n%10==1){
                n=n/10;
                if(n%10==1)
                {
                    System.out.println("Yes, Number Ends with 11");
                    return;
                }
                System.out.println("No, Number does not end with 11");
                return;
            }
            System.out.println("No, Number does not end with 11");
        }
        else{
            System.out.println("Not Applicable, Please Enter the number above 10");
        }
 
        

    }
}
