public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 3, 2, 8, 7, 1, 4, 9 };
        int tar = 10;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == tar)
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                }
            }
        }
    }
}
