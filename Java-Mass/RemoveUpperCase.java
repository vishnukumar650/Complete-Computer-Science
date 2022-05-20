import java.util.Scanner;
public class RemoveUpperCase{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}