public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 6, 4, 3, 2, 1, 5, 9 };
        int tar = 10;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == tar)
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }
}
