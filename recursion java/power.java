import java.util.*;

public class power {
    public static void main(String[] args) {
        int k = 5;
        int n = 3;
        System.out.println(po(k, n));

    }

    static int po(int k, int n) {
        if (n == 0) {
            return 1;
        } else {
            return k * po(k, n - 1);
        }

    }

}
