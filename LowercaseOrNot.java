public class LowercaseOrNot {

    public static int solve(char ch) {

        return ch >= 96 && ch <= 122 ? 1 : 0;

    }

    public static void main(string[] args) {

        char ch = 'a';

        int ans = solve(ch);
        System.out.println(ans);

    }
}
