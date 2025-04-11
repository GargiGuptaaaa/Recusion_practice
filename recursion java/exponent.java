public class exponent {
    public static void main(String[] args) {
        int p = 2;
        int q = 5;
        System.out.println(pow(p, q));

    }

    public static int pow(int p, int q) {
        if (q == 0) {
            return 1;
        }

        // First Approach Else Condition
        // } else {
        // return p * (int) Math.pow(p, q - 1);
        // }

        // Second Approach else condittion
        else {
            if (q % 2 == 0) {
                return (int) Math.pow(p, q / 2) * (int) Math.pow(p, q / 2);
            } else {
                return p * (int) Math.pow(p, q / 2) * (int) Math.pow(p, q / 2);
            }
        }

    }
}
