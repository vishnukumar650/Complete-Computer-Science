import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 4, 3, 2, 1 };
        Arrays.sort(arr);
        ArrayList<Integer> aL = new ArrayList<Integer>();
        aL.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                aL.add(arr[i]);
        }
        for (int t : aL) {
            System.out.println(t);
        }
    }
}
