import java.util.Scanner;
public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
        scan.close();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                for(int k=i;k<str.length();k++)
                    if(str.charAt(i)==str.charAt(k))
                        count++;
                if(count>1)
                    System.out.println(str.charAt(i));
            }
            count=0;
        }
    }
}

