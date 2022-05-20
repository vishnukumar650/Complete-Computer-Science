public class StringSplit {
    public static void main(String[] args) {
        String str = "  rock star welcome bull shit guy  ";
        String str2[] = str.trim().split(" ");

        for (String t : str2)
            System.out.println(t);
    }
}
