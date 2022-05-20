public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int start = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(start);
            start++;
            System.out.println();
        }
        start--;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print(start);
            start--;
            System.out.println();
        }
    }
}
