public class VovelOrNot {

    public static int solve(char ch) {
        return ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0);
    }

    public static void main(string[] args) {
        char ch = 'a';
        int ans = solve(ch);
        System.out.println(ans);
    }
}
