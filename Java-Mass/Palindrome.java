import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        scan.close();
        String str2="";
        for(int i=str.length()-1;i>=0;i--)
            str2+=str.charAt(i);
        if(str.equals(str2)){
            System.out.println("Yes, "+str+" is a palindrome text");
        }
        else{
            System.out.println("No, "+str+" is not a palindrome text");
        }
        
    }
}
