import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCSarray {

    static int lcs(List<Integer> a, List<Integer> b, int m, int n, int dp[][])
    {
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0||j==0)
                    dp[i][j] = 0;
                else if(a.get(i-1).equals(b.get(j-1)))
                    dp[i][j]= 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
   /* static String lcsString(int a[], int b[], int m, int n)
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
    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dp[][] = new int[100000][100000];
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int x=0;x<m;x++)
        {
            a.add(sc.nextInt());
        }
        for(int x=0;x<n;x++)
        {
            b.add(sc.nextInt());
        }
        //System.out.println(lcs(a,b,m,n));
      /* for(int x=0;x<s1.length()+1;x++){
            for(int y=0;y<s2.length()+1;y++){
                System.out.print(dp[x][y]+" ");
            }
            System.out.println(" ");
        }*/
        System.out.println(lcs(a,b,m,n,dp));
    }
}
