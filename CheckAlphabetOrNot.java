public class CheckAlphabetOrNot {
    public static int solve(char ch) {

        return ch >= 65 && ch <= 90 || ch >= 96 && ch <= 120 ? 1 : 0;

    }

    public static void main(string[] args) {

        char ch = '$';

        int ans = solve(ch);
        System.out.println(ans);

    }
}
