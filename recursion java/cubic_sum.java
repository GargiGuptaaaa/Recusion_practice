import java.util.Scanner;

public class cubic_sum {
    public static void main(String[] args) {
        System.out.println(sumof(5));
    }

    // static void helper(int N) {
    // int sum = 0;
    // if (N == 0) {
    // return;
    // } else {

    // System.out.println(N * N * N);
    // helper(N - 1);

    // }

    // }

    // static void helper(int N) {
    // if (N == 0) {
    // return;
    // } else {
    // int sum = 0;
    // for (int i = 1; i <= N; i++) {
    // sum += i * i * i;
    // }
    // System.out.println(sum);
    // }
    // }
    static long sumof(int N) {
        if (N == 0) {
            return 0;
        } else {
            return N * N * N + sumof(N - 1);

        }

    }

}
