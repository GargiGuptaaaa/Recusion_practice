public class max_array {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 45, 3, 65, 7 }; // ✅ Also correct
        System.out.println(max(arr, 0));

    }

    public static int max(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smax = max(arr, idx + 1);
        if (smax > arr[idx]) {
            return smax;
        } else {
            return arr[idx];
        }

    }
}
