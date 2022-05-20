public class StringReverseWords {
    public static void main(String[] args) {
        String str = "Always indent your code";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {

            if (str.charAt(i) == ' ' || i == 0) {
                if (i == 0)
                    i--;
                for (int j = i + 1; j < n && str.charAt(j) != ' '; j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.print(" ");
            }

        }
    }
}
