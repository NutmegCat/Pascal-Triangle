class PascalTriangle {

    static int factorial(int n) {

        int f;

        for (f = 1; n > 1; n--) {
            f *=n;
        }
        return f;
    }

    static int ncr (int n, int r) {
        return factorial(n) / (factorial(n - 1) * factorial(r));
    }

    public static void main(String[] args) {
        System.out.println();
        int n;
        int i;
        int j;
        n = 5;

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
                System.out.println(" ");
            }
            for (j = 0; j <= n; j++) {
                System.out.println(" " + ncr(i, j));
            }
            System.out.println();
        }
    }
}