public class AnagramsLightPractice {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "hel";
        int n = str.length();
        int m = str2.length();
        for (int i = 0; i < m; i++) {
            int match = 0;
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == str2.charAt(i))
                    match++;
            }
            if (match == 0) {
                System.out.println("Not found");
                return;
            }
        }
        System.out.println("Match Found");
    }
}
