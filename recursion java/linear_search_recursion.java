public class linear_search_recursion {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        System.out.println(search(arr));

    }

    public static int search(int n) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        return helper(arr, 0);
    }

    public static int helper(int arr[], int i) {
        if (arr[i] == 5) {
            return 1;
        } else {
            return helper(arr, i + 1);

        }

    }

}
