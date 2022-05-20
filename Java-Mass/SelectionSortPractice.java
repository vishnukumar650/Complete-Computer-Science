public class SelectionSortPractice {
    public static void main(String[] args) {
        int arr[] = { 11, 3, 0, 4, 2, 7, 6 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            int minValue = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minValue) {
                    minIndex = j;
                    minValue = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = minValue;
            arr[minIndex] = temp;
        }
        for (int t : arr)
            System.out.print(t + " ");
    }
}
