import java.util.Scanner;

public class LCS {
    static int dp[][] = new int[1000][1000];
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
    static String lcsString(String s1, String s2, int m, int n)
    {
        int i = m, j=n;
        String s ="";
        while (i>0&&j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1))
            { s = s1.charAt(i-1)+""+s;
            i--;j--;}
            else if(dp[i][j-1]>dp[i-1][j])
                j--;
            else
                i--;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int k = sc.nextInt();
        int lcs = lcs(s1,s2,n1,n2);
        String s ="";
        if(s1.length()>s2.length())
            s = s2;
        else
            s = s1;
        for(int x=0;x<s.length();x++)
        {
            if(k==0||s1.charAt(x)!=s2.charAt(x))
                break;
            else
                lcs++;
        }
        System.out.println(lcs);
    }
}
