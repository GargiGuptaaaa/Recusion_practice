public class sorting_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 4, 5 };
        System.out.println(sorted(arr));

    }

    public static boolean sorted(int arr[]) {
        return helper(arr, 0);
    }

    public static boolean helper(int arr[], int i) {

        // for sorting
        // if (arr[i] < arr[i + 1] && i < arr.length - 2) {
        // return helper(arr, i + 1);
        // }
        // if (arr[i] > arr[i + 1]) {
        // return false;
        // }
        // return true;

        // // linear search
        if (arr[i] == 4 && i < arr.length) {
            return true;
        } else if (arr[i] != 5) {
            return helper(arr, i + 1);
        } else {
            return false;
        }

    }
}
