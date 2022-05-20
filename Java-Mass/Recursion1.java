public class Recursion1 {
    public static void main(String[] args) {
        int n = 15;
        hello(n);
    }

    public static void hello(int n) {
        if (n < 1)
            return;

        System.out.println("Hello World!");
        hello(n - 1);
    }

}
