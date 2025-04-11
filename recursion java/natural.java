import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        helper(10);

    }

    static void helper(int N) {
        if (N == 0) {
            return;
        } else {
            helper(N - 1);
            System.out.print(N + " ");

        }

    }

}
