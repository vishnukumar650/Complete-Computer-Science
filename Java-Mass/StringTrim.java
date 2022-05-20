public class StringTrim {
    public static void main(String[] args) {
        String str = "hello bullshit guy";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                str2 += str.charAt(i);
        }
        System.out.print(str2);
    }
}
