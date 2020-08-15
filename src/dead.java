import java.util.Scanner;

public class dead {
    static int dp[][] = new int[10000][10000];
    static int lcs(String s1, String s2, int m, int n)
    {
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0||j==0)
                    dp[i][j] = 0;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]= 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=0,k=0;
        String s1="",s2="";
        if(sc.hasNext())
            n1 = sc.nextInt();
        if(sc.hasNext())
            n2 = sc.nextInt();
        if(sc.hasNext())
            k = sc.nextInt();
        if(sc.hasNext())
            s1 = sc.next();
        if(sc.hasNext())
            s2 = sc.next();

        int lcs = lcs(s1,s2,n1,n2);
        if(lcs==n2)
            System.out.println(lcs);
        else
            System.out.println(lcs+k);
    }
}
