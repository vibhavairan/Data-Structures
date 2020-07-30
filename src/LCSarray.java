import java.util.Scanner;

public class LCSarray {
    static int dp[][] = new int[1000][1000];
    static int lcs(int a[], int b[], int m, int n)
    {
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0||j==0)
                    dp[i][j] = 0;
                else if(a[i-1]==b[j-1])
                    dp[i][j]= 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    static String lcsString(int a[], int b[], int m, int n)
    {
        int i = m, j=n;
        String s ="";
        while (i>0&&j>0){
            if(a[i-1]==b[j-1])
            { s = a[i-1]+" "+s;
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
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        for(int x=0;x<m;x++)
        {
            a[x] = sc.nextInt();
        }
        for(int x=0;x<n;x++)
        {
            b[x] = sc.nextInt();
        }
        System.out.println(lcs(a,b,m,n));
      /* for(int x=0;x<s1.length()+1;x++){
            for(int y=0;y<s2.length()+1;y++){
                System.out.print(dp[x][y]+" ");
            }
            System.out.println(" ");
        }*/
        System.out.println(lcsString(a,b,m,n));
    }
}
