public class MaxOccuringChar {
    public static void main(String[] args) {
        String str = "hellorosss";
        char maxChar = 'h';
        int maxCount = 1;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }
        System.out.println(maxChar);
    }
}
