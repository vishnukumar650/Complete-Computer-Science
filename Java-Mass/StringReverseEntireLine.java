public class StringReverseEntireLine {
    public static void main(String[] args) {
        String str = "hello world for no reason";
        int n = str.length();
        int start = 0;
        String str2 = "";
        String revw = "";
        for (int i = 0; i < n; i++) {
            String revWord = "";
            int j;
            for (j = start; j < n; j++) {
                if (str.charAt(j) != ' ')
                    revWord = str.charAt(j) + revWord;
                else
                    break;
            }
            start = j + 1;
            str2 += " " + revWord;

        }

        System.out.println(str2);
    }
}
