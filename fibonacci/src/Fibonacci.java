public class Fibonacci {

    static int fib(int n) {
        int[] f = new int[n+2];
        f[0] = 0;
        f[1] = 1;
        for (int i=2; i<=n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
