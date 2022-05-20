public class MaxProductOfTwoIntegers {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, -10, -5 };
        int maxI = 0;
        int maxJ = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] * arr[j] > (arr[maxI] * arr[maxJ])) {
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(arr[maxI] + " " + arr[maxJ]);
    }
}
