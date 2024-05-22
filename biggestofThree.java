public class biggestofThree {

    public static int solve(int a, int b, int c)
    {
        return a>b&&a>c?a:b>c&&b>c?b:c;
    }
    
        public static void main(string[] args[]) {
            
            int a=10;
            int b=20;
            int c=30;

            int ans=solve(a, b, c);
            System.out.println(ans);
        }
}
