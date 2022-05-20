import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int arr[] = { 3, 5, -4, 8, 11, 1, -1, 6 };
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int tar = 10;
        for (int i = 0; i < n; i++) {
            int lr = arr[left] + arr[right];
            if (lr == tar) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            } else if (lr < tar) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Not found");
    }
}
