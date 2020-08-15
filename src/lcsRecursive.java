import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lcsRecursive {
    /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
        static int lcs( List<Integer> a, List<Integer> b, int m, int n )
        {
            if (m == 0 || n == 0)
                return 0;
            if (a.get(m-1).equals(b.get(n-1)))
                return 1 + lcs(a, b, m-1, n-1);
            else
                return Math.max(lcs(a, b, m, n-1), lcs(a, b, m-1, n));
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
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
            System.out.println(lcs(a,b,m,n));
        }
    }
