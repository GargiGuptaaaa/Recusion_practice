// public class multiple {
//     public static void main(String[] args) {
//         int n = 20;
//         int k = 5;
//         System.out.println(mul(n, k));
//     }

//     public static int mul(int n, int k) {
//         if (k == 1) {
//             System.out.println(n * k + " ");
//             return n;
//         } else {
//             // System.out.print(n * k + " ");
//             int result = mul(n, k - 1);
//             System.out.print(n * k + " ");
//             return result;

//         }

//     }
// }

public class multiple {
    public static void main(String[] args) {
        int n = 20;
        int k = 5;
        mul(n, k);
    }

    public static void mul(int n, int k) {
        if (k == 1) {
            System.out.print(n * k + " ");
            return;
        } else {
            mul(n, k - 1);
            System.out.print(n * k + " ");
        }
    }
}
