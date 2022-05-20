import java.util.Scanner;
public class IntegerReverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Integer n=scan.nextInt();
        scan.close();
        String s=n.toString();
        String s2="";
        for(int i=s.length()-1;i>=0;i--)
            s2+=s.charAt(i);
        System.out.println(s2);
    }
}
