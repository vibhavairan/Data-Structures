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
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
      /* for(int x=0;x<s1.length()+1;x++){
            for(int y=0;y<s2.length()+1;y++){
                System.out.print(dp[x][y]+" ");
            }
            System.out.println(" ");
        }*/
        System.out.println(lcsString(s1,s2,s1.length(),s2.length()));
    }
}
