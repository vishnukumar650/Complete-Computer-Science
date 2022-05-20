/*  Write a program to determine if a string has all unique characters. */
import java.util.Scanner;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();  
        scan.close();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count>=2)
            {
                System.out.println("String does not contain all unique characters");
                return;
            }
            count=0;
        }
        System.out.println("String contains all unique characters");
    }
}
