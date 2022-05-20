public class CloserToZero {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 9, 11, 15, -2, 24 };
        int n = arr.length;
        int mini = -1;
        int minj = -1;
        int nearSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int curSum = arr[i] + arr[j];
                if (curSum < 0)
                    curSum = (-(curSum));
                if (curSum < nearSum) {
                    nearSum = curSum;
                    mini = i;
                    minj = j;
                }
            }
        }
        System.out.println(mini + " " + minj + " " + nearSum);
    }
}
