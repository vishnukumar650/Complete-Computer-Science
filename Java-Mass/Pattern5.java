public class Pattern5 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 2; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
