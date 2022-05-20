import java.util.Scanner;
public class VowelCount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        scan.close();
        String str2=str.toLowerCase();
        int vowelCount=0;
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u')
                vowelCount++;
        }
        System.out.println("No. of Vowels in the given string "+str+" is "+vowelCount);

    }
}
