public class LeaderInAArray2 {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int current_leader = arr[arr.length - 1];
        System.out.print(current_leader + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > current_leader) {
                current_leader = arr[i];
                System.out.print(current_leader + " ");
            }
        }
    }
}
