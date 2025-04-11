public class sum_traingle {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        System.out.println(sum(arr));

    }

    public static int[] sum(int arr[]) {
        return helper(arr);

    }

    public static int[] helper(int arr[]) {
        if (arr.length == 1) {
            return arr;

        }
        int ans[] = new int[arr.length - 1];
        for (int j = 0; j < arr.length - 1; j++) {
            ans[j] = arr[j] + arr[j + 1];
        }
        return helper(ans);

    }
}
