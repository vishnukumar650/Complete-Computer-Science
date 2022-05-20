public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            long sum = 1;
            for (int j = 0; j < n; j++) {
                if (j != i)
                    sum *= arr[j];
            }
            System.out.println(sum);
        }
    }
}
