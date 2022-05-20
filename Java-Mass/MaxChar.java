import java.util.Scanner;
public class MaxChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        scan.close();    // abcdefa
        int startCount=0;
        char startChar=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(startChar==str.charAt(i)){
                startCount++;
            }
        }
        int maxCharCount=startCount;
        char maxChar=startChar;
        int tempCount=0;
        for(int i=1;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    tempCount++;
                }
            }
            if(maxCharCount<tempCount){
                maxCharCount=tempCount;
                maxChar=str.charAt(i);
            }
            tempCount=0;
        }
        System.out.println(maxChar);
        
    }
}
