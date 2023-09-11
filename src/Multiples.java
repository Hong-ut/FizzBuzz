public class Multiples {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}
