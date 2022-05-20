public class Leaders2 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 2, 8, 6, 4, 3, 1, 4, 6, 5, 3, 2, 3 };
        int n = arr.length;
        int cl = arr[n - 1];
        System.out.print(cl + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > cl) {
                cl = arr[i];
                System.out.print(cl + " ");
            }
        }

    }
}
