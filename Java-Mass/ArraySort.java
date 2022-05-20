import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 2, 5, 1, 9, 98, 65, 43, 32, 43, 56, 76 };
        Arrays.sort(arr);
        for (int t : arr)
            System.out.print(t + " ");
    }
}
