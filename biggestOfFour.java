public class biggestOfFour {


    public static int solve(int a, int b,int c, int d) {
        return a>b&&a>c&&a>d?a:(b>a&&b>c&&b>d)?b:(c>a&&c>b&&c>d)?c:d;
    }

    public static void main(string[] args) {

        int a = 10;
        int b = 20;
        int c=  40;
        int d=  30;

        int ans = solve(a, b,c,d);
        System.out.println(ans);

    }


}
