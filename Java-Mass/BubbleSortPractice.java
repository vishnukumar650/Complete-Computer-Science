public class BubbleSortPractice {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 7, 2, 6, 4 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int temp : arr)
            System.out.print(temp + " ");
    }
}
