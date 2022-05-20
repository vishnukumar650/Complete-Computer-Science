import java.util.Scanner;
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        String str2="";
        scan.close();
        if(str.charAt(0)>=65&&str.charAt(0)<=90)
            System.out.println("First Letter of a String is Already Done");
        else{
            char temp;
            temp=(char)(str.charAt(0)-32);
            str2+=temp;
            for(int i=1;i<str.length();i++){
                str2+=str.charAt(i);
            }
        }
        System.out.println("Text After Capitalizing : "+str2);
    }
}
