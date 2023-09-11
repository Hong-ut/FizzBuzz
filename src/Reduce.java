public class Reduce {
    public static void main(String[] args) {
//        For example, if you start with n = 2, the answer is 2. Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0.
        int n = 100;
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            };
            steps++;
        };

        System.out.println(steps);

    }
}
