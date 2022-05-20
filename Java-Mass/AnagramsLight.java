import java.util.Scanner;

public class AnagramsLight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str2 = scan.next();
        String str1 = scan.next();

        int match = 0;
        scan.close();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j))
                    match++;
            }
            if (match == 0) {
                System.out.println("False");
                return;
            }
            match = 0;
        }
        System.out.println("True");
    }
}
