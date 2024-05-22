public class validTriangle {

    public static int solve(int a, int b, int c) {
        return ((a + b > c || b + c > a || c + a > b) ? 0 : 1);
    }

    public static void main(string arg[]) {
        int a = 10;
        int b = 20;
        int c = 5;

        int ans = solve(a, b, c);
        System.out.println(ans);
    }
}
