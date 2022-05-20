import java.util.Scanner;
public class MapSymbolSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case '!':
                    sum+=1;
                    break;
                case '@':
                    sum+=2;
                    break;
                case '#':
                    sum+=3;
                    break;
                case '$':
                    sum+=4;
                    break;
                case '%':
                    sum+=5;
                    break;
                case '^':
                    sum+=6;
                    break;
                case '&':
                    sum+=7;
                    break;
                case '*':
                    sum+=8;
                    break;
            }
        }
        System.out.println(sum);
    }    
}
