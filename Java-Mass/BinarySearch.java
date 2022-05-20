public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 9, 13, 16, 21 };
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int tar = 13;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == tar) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > tar)
                e = mid - 1;
            else
                s = mid + 1;
        }
        System.out.println(-1);
    }
}
