public class first_occurence {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 5, 4, 3, 6, 4, 3 };
        int key = 3;
        System.out.println(firstoccur(arr, key, 0));

        System.out.println(lastoccur(arr, key, 0));

    }

    public static int firstoccur(int arr[], int key, int idx) {

        if (arr[idx] == key) {
            return idx;
        } else {
            return firstoccur(arr, key, idx + 1);
        }
    }

    public static int lastoccur(int arr[], int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        int small = lastoccur(arr, key, idx + 1);
        if (small != -1) {
            return small; // Return the later occurrence if found
        }
        if (arr[idx] == key) {
            return idx;
        }
        return -1;
    }

}
