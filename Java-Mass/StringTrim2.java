public class StringTrim2 {
    public static void main(String[] args) {
        char c = '\u2000';
        String str = c + "hello welcome guys  " + c;
        // System.out.println("hello" + c + "bull");
        System.out.print(str.strip());
        System.out.println("hello");
    }
}
