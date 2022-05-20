public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 0, 4, 2, 7, 6 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = arr[i];
            int minInd = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minInd] = temp;
        }
        for (int t : arr)
            System.out.print(t + " ");
    }
}
