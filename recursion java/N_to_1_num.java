import java.util.*;

public class N_to_1_num {
    public static void main(String[] args) {
        fun(5);
        System.out.println(fact(5));
        
    }

    public static void fun(int n) {
        if (n == 0) {
        return;
        }
        System.out.println(n);
        fun(n - 1);
        if (n == 1) {
        System.out.println(n);
        } else {
        System.out.println(n);
        fun(n - 1);
        }
        if (n == 5) {
        System.out.println(5);
        } else {
        System.out.println(n);
        fun(n + 1);
        }

        
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }
    
   
    
}