public class divisibleBy5or11 {

    public static int solve(int n) {
        return n % 5 == 0 && n % 11 == 0 ? 1 : 0;
    }

    public static void main(string[] args) {
        int n = 55;
        int ans = solve(n);
        System.out.println(ans);
    }
}
