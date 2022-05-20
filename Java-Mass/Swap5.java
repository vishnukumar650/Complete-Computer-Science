public class Swap5 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        a = a + b + c; // 6
        c = a - (b + c); // 1
        b = a - (b + c); // 3
        a = a - (b + c); // 2

        System.out.print(a + " " + b + " " + c);

    }
}
