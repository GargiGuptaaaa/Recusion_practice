public class sod {
    public static void main(String[] args) {
        int n = 120;
        int sum = 0;
        System.out.println(s(n, sum));
    }

    public static int s(int n, int sum) {
        if (n <= 0) {
            return sum;
        } else {
            int rem = n % 10;
            sum = sum + rem;
            return s(n / 10, sum);
        }
    }
}
